package multithreading.createNewThread;

public class RunnableDemo {

    public static void main(String[] args) {
        Runnable show100A = new Show100A(); // 將任務類 傳給 new Thread();

        Thread threadA = new Thread(show100A); // 線程類
        threadA.start(); // 啟動線程
    }
}

class Show100A implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.printf("a");
        }
    }
}
