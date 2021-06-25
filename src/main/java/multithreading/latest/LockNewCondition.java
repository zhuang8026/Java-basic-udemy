package multithreading.latest;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockNewCondition {

	private static AccountV1 accountv1 = new AccountV1();

	public static void main(String[] args) {
		ExecutorService executorV1 = Executors.newFixedThreadPool(2);
		executorV1.execute(new DepositTaskV1()); // 存錢
		executorV1.execute(new WithdrawTaskV2()); // 取錢
		executorV1.shutdown(); // 停止全部任務

		System.out.println("Thread 1\t\tThread 2\t\t\t\t\t\t\t\t\tBalance(剩餘)");
	}

	// 存錢線程
	public static class DepositTaskV1 implements Runnable {

		@Override
		public void run() {
			try {
				// 無限循環
				while (true) {
//					accountv1.setMoney((int) (Math.random() * 10) + 1);
					accountv1.setMoney(12); // 存入 12 元
					Thread.sleep(1000); // 每存入一次，就休息1000毫秒再繼續
				}
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
		}
	}

	// 取錢線程
	public static class WithdrawTaskV2 implements Runnable {

		@Override
		public void run() {
			// 無限循環
			while (true) {
				accountv1.getMoney((int) (Math.random() * 10) + 1); // 亂數去錢
			}
		}
	}

	private static class AccountV1 {

		// Create lock
		private static Lock lock = new ReentrantLock();
		// lock newCondition
		private static Condition newDepositV1 = lock.newCondition();

		private int balance = 0; // 存款

		// 存款數量
		public int getBalance() {
			return balance;
		}

		// 取錢
		public void getMoney(int amount) {
			lock.lock();
			try {
				// 帳戶錢不夠的時
				while (balance < amount) {
					System.out.println("\t\t\t\t\t\t帳戶餘額不足");
					newDepositV1.await(); // 線程進入等待狀態
										  // 並釋放 newDepositV1 上的鎖，setMoney中的 newDepositV1 就會接收到
				}
				balance -= amount;
				System.out.println(
						"\t\t\t\t\t\t取錢： " + amount + "\t\t\t\t\t\t\t\t\t" + getBalance());
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			} finally {
				lock.unlock();
			}
		}

		// 存錢
		public void setMoney(int amount) {
			lock.lock();
			try {
				balance += amount;
				System.out.println(
						"存入 " + amount + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t餘額: " + getBalance());
				newDepositV1.signalAll(); // 喚起所有正在等待的線程
			} finally {
				lock.unlock();
			}
		}


	}

}