package onedimensionalarray;

import java.util.Arrays;

public class ArraysClassDemo {

  public static void main(String[] args) {
    double[] numbers = {6.0, 4.4, 1.9, 2.9, 3.4, 3.5};
    java.util.Arrays.sort(numbers); // array類的方法 -> sort() 升冪

    for (double e : numbers) {
      System.out.print(e + " ");
    }

    System.out.println();

    char[] chars = {'a', 'A', '4', 'F', 'D', 'P'};
    java.util.Arrays.sort(chars);

    System.out.println(chars);

    int[] list = {12, 31, 4, 1, 6, 8, 1};
    int[] list1 = {31, 12, 4, 1, 6, 8, 1};

    int index = Arrays.binarySearch(list, -1); // array類的方法 -> binarySearch(數組, 尋找的參數) -> 回傳int
    System.out.println("index=" + index);

    boolean flag = Arrays.equals(list, list1); // equals 比對內容

    System.out.println("flag=" + flag); // false (比對的內容，就算還是一樣，順序必須一樣)

//    Arrays.fill(list, 10);
//    for (double e : list) {
//      System.out.print(e + " ");
//    }

    Arrays.fill(list, 1, 5, 11); // fill 填充內容
                                                      // fill(list, 開頭, 結尾, 填充的參數);

    for (double e : list) {
      System.out.print(e + " ");
    }

    System.out.println();

    System.out.println(Arrays.toString(list)); // toString 遍歷數組，並回傳字符串

  }

}
