package arraydemo.mainMethodDemo;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayProblem13 {

  public static void main(String[] args) {
    int[] oldList = {1, 2, 3, 4, 5};
    reverse(oldList);

    System.out.println(" ");

    System.out.println(Arrays.toString(oldList));

    System.out.println(" ");

    for (int i = 0; i < oldList.length; i++) {
      System.out.print(oldList[i] + " "); // 12345
    }
  }

  public static void reverse(int[] list) {
//    int[] newList = new int[list.length];
//
//    for (int i = 0; i < list.length; i++) {
//      newList[i] = list[list.length - 1 - i];
//      System.out.print(newList[i] + " "); // 54321
//    }
//
//    list = newList;

    for (int i = 0; i < list.length; i++) {
      int temp = list[i];
      int num = list.length - 1;
      list[i] = list[num - i];
      list[num - i] = temp;
      // 0 = 4
      // 1 = 3
      // 2 = 2
      // 3 = 1
      // 4 = 0
      System.out.print(list[i] + " "); // 54321
    }

  }
}
