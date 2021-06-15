package datastructure.queue;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class QueueDemo {

  public static void main(String[] args) {
    Queue<Integer> queue = new LinkedList<>();

    queue.offer(1); // 添加
    queue.offer(4); // 添加
    queue.offer(2); // 添加
    queue.add(3);      // 添加

    System.out.println(queue); // [1, 4, 2, 3]

    System.out.println(queue.poll()); // 1,  獲取並移除(先進現出的概念)，所以是 1
    System.out.println(queue);

    System.out.println(queue.peek());  // 2,  獲取不移除(先進現出的概念)，所以是 2
    System.out.println(queue);


  }
}
