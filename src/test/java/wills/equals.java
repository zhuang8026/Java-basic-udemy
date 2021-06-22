package wills;

import java.util.Arrays;

public class equals {

  public static void main(String[] args) {
    String a1 = "williams";
    String a2 = "williams";
    System.out.println(a1.equals(a2)); // true

    String a11 = new String("williams");
    String a22 = new String("williams");
    System.out.println(a11.equals(a22)); // true

    String[] b1 = {"a", "b", "c"};
    String[] b2 = {"a", "b", "c"};
    System.out.println(Arrays.equals(b1, b2)); // true


  }
}
