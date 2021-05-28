package wills;

public class 構造字符串 {

  public static void main(String[] args) {
    String str = "hello world"; // 13 替換 字符串
    String str2 = new String("hello world 2");

    char[] chr = {'a','b', 'c'};
    String mes = new String(chr); // 封裝類型的String本身有自動迴圈char[] 並組合起來的方法
    System.out.println(mes);

    str = "william"; // 引用新的字符串，並廢棄舊的字符串
    System.out.println(str);

    String s1 = "hello world";
    String s2 = "hello world";
    String s3 = new String("hello world");
    System.out.println(s1 == s2);
    System.out.println(s1 == s3);
    System.out.println(s1.equals(s3));
  }
}
