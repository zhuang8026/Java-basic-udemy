package wills;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Expection {

  public static void main(String[] args) {
//    System.out.println("請輸入：");
//    Scanner input = new Scanner(System.in);
    try {
      int id = 101;
      String name = "Tom";
      System.out.println("id = " + id + "\n" + "name" + name);
    } catch(InputMismatchException ex) {
      System.out.println("输入数据不合规范");
      System.exit(1);
      ex.printStackTrace();
    } finally {
      System.out.println("输入结束");
    }
  }
}
