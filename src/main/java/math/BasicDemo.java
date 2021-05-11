package math;

public class BasicDemo {

  public static void main(String[] args) {
    System.out.println(Math.sin(0));
    System.out.println(Math.cos(0));

    System.out.println(Math.sin(Math.PI / 2));

    System.out.println(Math.exp(1));
    System.out.println(Math.log(Math.E));

    System.out.println(Math.pow(2, 3));
    System.out.println(Math.sqrt(4));

    // 取整數
    System.out.println(Math.ceil(2.1)); // 向上取整
    System.out.println(Math.floor(2.1)); // 向下取整
    System.out.println(Math.rint(2.1)); // 取得最接近的整數
    System.out.println(Math.round(2.6f)); // 3 ,return (int)Math.floor(x+0.5)
    System.out.println(Math.round(2.1));  // 2, return (long)Math.floor(x+0.5)

    // 最大值 && 最小值
    System.out.println(Math.max(10, 100)); // 100
    System.out.println(Math.max(10.1, 100)); // 100.0
    System.out.println(Math.min(10, 100)); // 10
    System.out.println(Math.min(10, 100.1)); // 10.1

    // 回傳絕對值
    System.out.println(Math.abs(-1000)); // 1000
    System.out.println(Math.abs(-10.2)); // 10

    for (int i = 0; i < 5; i++) {
      System.out.println((int)(Math.random() * 10));
    }

    for (int i = 0; i < 5; i++) {
      System.out.println(50+(int)(Math.random() * 50));
    }


  }
}
