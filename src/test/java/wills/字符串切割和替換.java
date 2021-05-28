package wills;

import java.util.Arrays;

public class 字符串切割和替換 {

  public static void main(String[] args) {
    String a = "hello william";

    // 替換
    System.out.println(a.replace('i', 'G')); // 將全部的 i 轉成 G
    System.out.println(a.replaceFirst("i", "g")); // 將第一個i 轉成 g
    System.out.println(a.replaceAll("i", "K")); // 將全部的 i 轉成 K

    // 切割
    String[] s = a.split(" "); // 切割字串，並return 數組
    System.out.println(Arrays.toString(s));
  }
}
