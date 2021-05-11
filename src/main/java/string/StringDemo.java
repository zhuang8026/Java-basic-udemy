package string;

public class StringDemo {

  public static void main(String[] args) {

    String message = "Welcome to Java!";

    System.out.println(message.length()); // String[].length
    System.out.println(message.charAt(2)); // "l"
    String concatMessage = message.concat("Andrew"); // concat 會返回新的字串 => Welcome to Java! Andrew
    System.out.println(concatMessage);
    System.out.println(message);

    System.out.println(message.toUpperCase());
    System.out.println(message.toLowerCase());

    String messageWithBlank = " \tWelcome\n     "; // 空白字符 => ""、\t、\f、\r、\n
    System.out.println(messageWithBlank);
    System.out.println(messageWithBlank.trim());


  }

}
