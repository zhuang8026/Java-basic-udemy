package onedimensionalarray;

public class VarArgsDemo {

  public static void main(String args[]) {
    printMax(34, 3, 3, 2, 56.5, 1, 3); // 傳入之後會被看成 數組
    printMax(new double[]{1, 2, 3}); // 匿名數組, 直接傳入也是沒問題的

    printString(111, "a", "b"); // 字串傳入
  }

  // "..." 可變長參數
  public static void printMax(double... numbers) { // 在方法中，可變長參數只能有一個
    if (numbers.length == 0) {
      System.out.println("No argument passed");
      return;
    }

    double result = numbers[0];

    for (int i = 1; i < numbers.length; i++) {
      if (numbers[i] > result) {
        result = numbers[i];
      }
    }

    System.out.println("The max value is " + result);
  }

  public static void printString (int s, String... strItems){ // "..." 必須放在最後
    if (strItems.length == 0) {
      System.out.println("No argument passed");
      return;
    }
  }
}
