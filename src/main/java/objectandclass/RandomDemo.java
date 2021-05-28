package objectandclass; // 自定義規定，此文件來自於 objectandclass files

import java.util.Random;

public class RandomDemo {

  public static void main(String[] args) {
    Random random1 = new Random(3);
    System.out.print("From random1: ");
    for (int i = 0; i < 10; i++) {
      System.out.print(random1.nextInt(10000) + " "); // nextInt(0~10000); 不包含 10000
    }

    Random random2 = new Random(3);
    System.out.print("\nFrom random2: ");
    for (int i = 0; i < 10; i++) {
      System.out.print(random2.nextInt(1000) + " "); // nextInt(0~100); 不包含 1000
    }

    Math.random(); // random 是一個靜態方法，只要是靜態方法，任何文件修改，都會影響到其他文件
  }
}
