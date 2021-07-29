package wills;

import java.util.Arrays;

public class 正則表達式 {

  public static void main(String[] args) {
    boolean a = "java is fun".matches("java.*");
    System.out.println(a);

    boolean b = "400-02-4534".matches("\\d{3}-\\d{2}-\\d{4}");
    System.out.println(b);

    String c = "a$+b$#c".replaceAll("[$+#]", "K"); // 有 "$+#" 換成 "K"
    System.out.println(c);

    String[] d = "Java,C?C#,C++".split("[.,:;?]"); // 有".,:;?"就除去
    System.out.println(Arrays.toString(d));
    System.out.println("-----------");
    for(String ss: d){
      System.out.println(ss);
    }
    System.out.println("這是測試");
  }
}
