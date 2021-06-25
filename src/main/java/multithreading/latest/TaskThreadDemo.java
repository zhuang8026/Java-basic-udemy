package multithreading.latest;

/*
The first thread prints the letter a 100 times.
The second thread prints the letter b 100 times.
The third thread prints the integers 1 through 100.
 */
public class TaskThreadDemo {

	public static void main(String[] args) {
		// Create tasks
		Runnable printA = new PrintChar('a', 10);
		Runnable printB = new PrintChar('b', 10);
		Runnable print100 = new PrintNum(10);

		// Create threads
		Thread thread1 = new Thread(printA);    // PrintChar
		Thread thread2 = new Thread(printB);    // PrintChar
		Thread thread3 = new Thread(print100);  // PrintNum

		thread3.setPriority(Thread.MAX_PRIORITY); //優先級設定 10 最高(範圍 1-10)
		// Start threads
		thread1.start();
		thread2.start();
		thread3.start();

	}
}

// The task for printing a specified character in specified times
class PrintChar implements Runnable {

	private char charToPrint; // The character to print
	private int times; // The times to repeat

	/**
	 * Construct a task with specified character and number of times to print the character
	 */
	public PrintChar(char c, int t) {
		charToPrint = c;
		times = t;
	}

	@Override
	/** Override the run() method to tell the system
	 *  what the task to perform
	 */
	public void run() {
		for (int i = 0; i < times; i++) {
			System.out.print(charToPrint);
		}
	}
}

// The task class for printing number from 1 to n for a given n
class PrintNum implements Runnable {

	private int lastNum;

	/**
	 * Construct a task for printing 1, 2, ... i
	 */
	public PrintNum(int n) {
		lastNum = n;
	}

	@Override
	/** Tell the thread how to run */
	public void run() {
		Thread thread4 = new Thread(new PrintChar('c', 10));
		thread4.start();

		try {
			for (int i = 1; i <= lastNum; i++) {
				System.out.print(" " + i);
//      Thread.yield();
/*      try {
        Thread.sleep(100); // 等待 100 在繼續執行
      } catch (InterruptedException e) {
        e.printStackTrace();
      }*/

				if (i == 3) {
					System.out.println("'當 i=3 時，加入線程 thread4'");
					thread4.join(); // 當 i=3 時，加入線程 thread4
					System.out.println("");
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}


	}
}

