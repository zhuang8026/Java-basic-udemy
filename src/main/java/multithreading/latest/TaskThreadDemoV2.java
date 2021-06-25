package multithreading.latest;

public class TaskThreadDemoV2 {

	public static void main(String[] args) {
		Runnable p1 = new PrintCharV2('a', 10);

		Thread t1 = new Thread(p1); // or new Thread(p1).start();
		t1.start();
	}

}

class PrintCharV2 implements Runnable {

	private char charToPrint;
	private int times;

	public PrintCharV2(char i, int s) {
		this.charToPrint = i;
		this.times = s;
	}

	@Override
	public void run() {
		for (int i = 0; i < times; i++) {
			System.out.println(charToPrint);
		}
	}
}
