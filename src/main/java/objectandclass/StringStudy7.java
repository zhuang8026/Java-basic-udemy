package objectandclass;

public class StringStudy7 {

  public static void main(String[] args) {

    StringBuilder sb = new StringBuilder(66);
    StringBuffer sb1 = new StringBuffer();

    sb.append("Welcome");
    sb.append(' ');
    sb.append("to");
    sb.append(' ');
    sb.append("Java");

    System.out.println(sb.toString());

    sb.insert(11,"HTML and "); // 下標為11添加

    System.out.println(sb.toString());

    sb.delete(8,11);  // 刪除下標8 - 11
//    sb.delete(8, sb.length());
    System.out.println(sb.toString());

    sb.deleteCharAt(8);  // 刪除下標為8的字符
    System.out.println(sb.toString());

    sb.reverse();
    System.out.println(sb.toString());


    System.out.println("capacity：" + sb.capacity()); // 55 -> capacity 會返回此構建器的容量，可以在上面設定(初始化)
    System.out.println("sb1-capacity：" + sb1.capacity()); // 16

    System.out.println("length：" + sb.length());

    sb.append("11111111111111111111111111111111111");

    System.out.println("capacity：" + sb.capacity());
    System.out.println("toString：" + sb.toString());

    System.out.println("length：" + sb.length());


    sb.trimToSize(); // 將 StringBuilder 目前所包含容量的大小一致（本來是66，現在是55）
    System.out.println("capacity：" + sb.capacity());

    System.out.println("length：" + sb.length());




  }

}
