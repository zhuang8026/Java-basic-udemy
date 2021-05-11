package string;

import java.util.Scanner;

public class ReadStringFromConsole {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
//    String s1 = input.next();
//    String s2 = input.next();
//    String s3 = input.next();
//
//    System.out.println("s1 is " + s1);
//    System.out.println("s2 is " + s2);
//    System.out.println("s3 is " + s3);

    String s4 = input.nextLine(); // 切割字符串，變成 char (wills => [w,i,l,l,s])
    char ch = s4.charAt(0); // 讀取第一個字符（字符 != 字符串）
    System.out.println(ch); // w
  }

}
