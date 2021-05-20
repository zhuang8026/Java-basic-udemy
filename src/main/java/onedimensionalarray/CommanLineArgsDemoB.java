package onedimensionalarray;

public class CommanLineArgsDemoB {

  // 一般方法，其他文件要先 實例化 才能呼叫
  public void test(String[] items) {
      for (int i = 0; i < items.length; i++) {
        System.out.println("test:" + items[i]);
      }
  }

  // main is static
  public static void main(String[] args) {
    // args = new String[0]  args != null
    for (int i = 0; i < args.length; i++) {
      System.out.println("main:" + args[i]);
    }
  }
}
