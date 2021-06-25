package wills;

import java.util.LinkedList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
 * 消費者 和 生產者
 * */
public class LockSolderAndBuyer {

	private static Buffer buffer = new Buffer();

	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(2);// 設定線程為2
		executor.execute(new Producer()); // 添加並執行
		executor.execute(new Buyer());    // 添加並執行
		executor.shutdown();              // 停止全部任務
	}

	// 生產者線程
	public static class Producer implements Runnable {

		@Override
		public void run() {
			try {
				int i = 1;
				while (true) {
					System.out.println("Producer setIn " + i);
					buffer.setIn(i++); // Add a value to the buffer
					// Put the thread into sleep
					Thread.sleep(1000);
				}
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
		}
	}

	// 消費者線程
	public static class Buyer implements Runnable {

		@Override
		public void run() {
			try {
				while (true) {
					buffer.soldOut();
					System.out.println("\t\t\t\t\t\t\t\t\t\t\tConsumer buy " + buffer.soldOut());
					// Put the thread into sleep
					Thread.sleep(2000);
				}
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
		}
	}

	private static class Buffer {

		private static final int CAPACITY = 1;
		private LinkedList<Integer> list = new LinkedList<Integer>();

		public LinkedList<Integer> getList() {
			return list;
		}

		// create lock
		private static Lock lock = new ReentrantLock();

		// create condition
		private static Condition notEmpty = lock.newCondition(); // 貨物缺乏？
		private static Condition notFull = lock.newCondition();  // 貨物充足？

		// 存入
		public void setIn(int value) {
			lock.lock();
			try {
				// 貨物充足 yes
				while (list.size() == CAPACITY) {
					System.out.println("Wait for notFull condition");
					notFull.await();
				}
				list.add(value);
				System.out.println("list size:" + list.size());
				notEmpty.signal();
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			} finally {
				lock.unlock();
			}

		}

		// 賣出
		public int soldOut() {
			int value = 0;
			lock.lock();
			try {

				// 貨物缺乏 yes
				while (list.isEmpty()) {
					System.out.println("\t\t\t\t\t\t\t\t\t\t\tWait for notEmpty condition");
					notEmpty.await();
				}
				value = list.remove(); // 刪除並返回參數
				notFull.signal();
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			} finally {
				lock.unlock();
				return value;
			}
		}

	}
}
