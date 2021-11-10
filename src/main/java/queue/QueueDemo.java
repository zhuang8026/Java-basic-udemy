package queue;
// Java orogram to demonstrate working of Queue
// interface in Java

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        // Adds elements {0, 1, 2, 3, 4} to queue
        for (int i = 0; i < 5; i++) {
            q.add(i); // or q.offer(i);
        }

        // Display contents of the queue.
        System.out.println("Elements of queue-" + q); // [0, 1, 2, 3, 4]

        // To remove the head of queue.
        int removedele = q.remove(); // 0
        System.out.println("removed element-" + removedele); // [1, 2, 3, 4]

        System.out.println(q);

        // To view the head of queue
        int head = q.peek(); // 1
        System.out.println("head of queue-" + head); // [1, 2, 3, 4]

        // Rest all methods of collection interface,
        // Like size and contains can be used with this
        // implementation.
        int size = q.size(); // 4
        System.out.println("Size of queue-" + size); // 4

        q.clear();
        System.out.println("clear of queue-" + q); // []

        q.remove(); // system error - NoSuchElementException extends RuntimeException
        // RuntimeException 是系統錯誤，所以不需要try catch 捕獲
    }

}
