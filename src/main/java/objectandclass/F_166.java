package objectandclass;

public class F_166 {

  private int x = 0; // Instance variable
  private int y = 0;

  public F_166() {
  }

  public void p() {
    int x = 1; // Local variable
    System.out.println("x = " + x); // 局部變量 > 類部變量，這裏會優先使用 12行，不會使用 5行
    System.out.println("y = " + y);
  }
}
