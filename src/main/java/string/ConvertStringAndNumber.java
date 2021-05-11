package string;

/* 89. 字符串和数字间的转换 */
public class ConvertStringAndNumber {

  public static void main(String[] args) {
    String s1 = "123";
    int intValue = Integer.parseInt(s1); // Integer 是 int 的包裝類
    System.out.println(intValue); // 123

    System.out.println(Double.parseDouble(s1)); // 123.0 (轉double )

    String s2 = 123 + "";
    System.out.println(s2);

  }

}
