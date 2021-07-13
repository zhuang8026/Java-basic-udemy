package datastructure.stack;

import java.util.List;
import java.util.Stack;

public class StackDemo {

  public static void main(String[] args) {
    Stack<Integer> stack = new Stack<>();
    List<Integer> list = new Stack<>();
    list.add(1);

    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);
    stack.push(5);
    stack.push(6);

    System.out.println(stack); // [1, 2, 3, 4, 5, 6]

    System.out.println(stack.pop()); // 6 - 只取得，且抽離 items
    System.out.println(stack); // [1, 2, 3, 4, 5]

    System.out.println(stack.peek()); // 5 -  只取得，但不抽離 items
    System.out.println(stack); // [1, 2, 3, 4, 5]

    while (!stack.isEmpty()){ // 抽離全部 參數
      System.out.println(stack.isEmpty()); // false
      System.out.println(stack.pop()); // 取得最後一個參數並刪除
    }

    System.out.println(stack); // [] 因為上面已經刪空了

  }
}
