package string;

public class SubstringDemo {

  public static void main(String[] args) {
    String message = "Welcome to Java!";

    // substring 為 左閉 右開， 0,11 只會尋找 1~10 的字符串
    System.out.println(message.substring(0, 11)); // 1~10 -> Welcome to
    System.out.println(message.substring(11));    // 從 11 開始 -> Java!
    System.out.println(message.substring(0));     // Welcome to Java!

    String name = "Andrew Programing";

    int k = name.indexOf(' ');
    String firstName = name.substring(0, k); // Andrew
    String lastName = name.substring(k + 1); // Programing

    System.out.println("first name:" + firstName + " last name:" + lastName);


  }

}
