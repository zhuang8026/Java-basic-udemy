package onedimensionalarray;

import java.util.Scanner;

public class ArrayOperate2 {

  public static void main(String[] args) {
    double myList[] = new double[10];

    // myList add value
    for (int i = 0; i < myList.length; i++) {
      myList[i] = Math.random() * 100;
    }

    // 迴圈出資料
    for (int i = 0; i < myList.length; i++) {
      System.out.print(myList[i] + " ");
    }

    System.out.println();
    char[] city = {'D', 'B', 'A'};
    System.out.println(city); // DBA , 只有char 才能有此效果

    System.out.println();
    int[] cityv2 = {1, 2, 3};
    System.out.println(cityv2); // [I@2626b418

    System.out.println();
    String[] cityv3 = {"D", "B", "A"};
    System.out.println(cityv3); // [Ljava.lang.String;@5a07e868

  }

}
