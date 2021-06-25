package multithreading.latest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {

  public static void main(String[] args) {
    // Create a fixed thread pool with maximum three threads
    ExecutorService ex = Executors.newFixedThreadPool(3); // 創建3固定個線程池
                                                                    // 線程的數量和非同步很像 (多線程)
                                                                    // 數量越少，同步的機率越大，數量1，就是同步

    ExecutorService executor = Executors.newCachedThreadPool(); // 可伸縮線程

    // Submit runnable tasks to the executor
    executor.execute(new PrintChar('a', 100)); // 執行任務
    executor.execute(new PrintChar('b', 100)); // 執行任務
    executor.execute(new PrintNum(100));          // 執行任務

    // isShutdown 線程池中 任務是否被關閉
    System.out.println("-is shutdown:" + executor.isShutdown());
    // Shut down the executor
    executor.shutdown(); // 關閉執行器，但允許執行器中的任務執行完成
//    executor.shutdownNow(); // 立刻關閉執行器，他會返回List，List 就是我們還沒有完成的任務
    System.out.println("-is shutdown:" + executor.isShutdown());

    // isTerminated 線程池中 任務是否被終止
    System.out.println("-is terminated:" + executor.isTerminated());

    while (!executor.isTerminated()){
      if(executor.isTerminated()){
        System.out.println("-is terminated:"+executor.isTerminated());
        break;
      }
    }







  }
}