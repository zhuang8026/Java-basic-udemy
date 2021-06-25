package multithreading.latest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AccountWithoutSyncV2 {

	private static Account account = new Account();

	public static void main(String[] args) {
		ExecutorService executor = Executors.newCachedThreadPool();

		// Create and launch 100 threads
		for (int i = 0; i < 100; i++) {
			executor.execute(new AddAPennyTask()); // 循環100，新增AddAPennyTask 任務
		}

		executor.shutdown(); // 關閉執行器，100%關閉線程池中所有的任務

		// Wait until all tasks are finished
		while (!executor.isTerminated()) { // 檢查線程池中任務是否全部關閉
			if (executor.isTerminated()) {
				System.out.println("What is balance? " + account.getBalance());
			}
		}

	}

	// 創建 線程
	// A thread for adding a penny to the account
	private static class AddAPennyTask implements Runnable {

		public void run() {
			// synchronized 同步塊
			//  synchronized ( 將上鎖的對象 )
			synchronized (account) {
				account.deposit(1);
			}
		}
	}

	// An inner class for account
	private static class Account {

		private int balance = 0;

		public int getBalance() {
			return balance;
		}

		// 添加存款
		public void deposit(int amount) {
			int newBalance = balance + amount;

			// This delay is deliberately added to magnify the
			// data-corruption problem and make it easy to see.
			try {
				Thread.sleep(5);
			} catch (InterruptedException ex) {
			}

			balance = newBalance; // 更新帳戶餘額
		}
	}
}