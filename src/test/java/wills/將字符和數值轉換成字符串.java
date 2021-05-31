package wills;

public class 將字符和數值轉換成字符串 {

  public static void main(String[] args) {
    Integer a = 1;
    String b = String.valueOf(a);
    System.out.println(b);
    System.out.println(b instanceof String); // b 是不是 String 的實例
    System.out.println(a instanceof Integer);

    String c = a + "";
    System.out.println(c instanceof String);

    String d = String.valueOf('a');
    System.out.println(d);

    String e = String.valueOf(true);
    System.out.println(e instanceof String);
    System.out.println(e);
  }
}
