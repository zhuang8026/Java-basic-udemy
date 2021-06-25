package multithreading.latest;

import java.util.Collection;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockNewConditionV2 {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		executorService.execute(new SetIn()); // start 1
		executorService.execute(new GetOut()); // start 2
		executorService.shutdown(); // stop all

		System.out.println("Thread 1\t\tThread 2\t\t\t\t\t\t\t\t\tBalance(剩餘)");
	}

	public static AccountV2 accountV2 = new AccountV2();

	// Set In Runnable
	public static class SetIn implements Runnable {

		@Override
		public void run() {
			try {
				while (true) {
					accountV2.setMoney((int) (Math.random() * 10) + 1);
					Thread.sleep(1000); // sleep throws InterruptedException
				}
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
		}
	}

	// Get out Runnable
	public static class GetOut implements Runnable {

		@Override
		public void run() {
			while (true) {
				accountV2.getMoney((int) (Math.random() * 10) + 1);
			}
		}
	}

	// main
	public static class AccountV2 {

		// create lock
		private static Lock lock = new ReentrantLock();

		// create Condition
		private static Condition newSetIn = lock.newCondition();

		private int balance = 0; // 存款

		public int getBalance() {
			return balance;
		}

		// 存錢
		public void setMoney(int amount) {
			lock.lock();
			try {
				balance += amount;
				System.out.println(
						"存入 " + amount + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t餘額: " + getBalance());
				newSetIn.signalAll();
			} finally {
				lock.unlock();
			}
		}

		// 取錢
		public void getMoney(int amount) {
			lock.lock();
			try {
				System.out.println("準備取" + amount + "元");
				while (balance < amount) {
					System.out.println("\t\t\t\t\t\t帳戶餘額不足");
					newSetIn.await();
				}
				balance -= amount;
				System.out
						.println("\t\t\t\t\t\t取走： " + amount + "\t\t\t\t\t\t\t\t\t" + getBalance());
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			} finally {
				lock.unlock();
			}
		}


	}
}