package onedimensionalarray;

public class ArrayDemo1 {

  public static void main(String[] args) {
//    double[] myList = new double[10];
//    myList[0] = 5.6;
//    myList[1] = 4.5;
//    myList[2] = 3.3;

     double[] myList = { 5.6, 4.5, 3.3 }; // 等價於上面

    System.out.println(myList[2]);

    int[] num = new int[3];
    System.out.println("default：" + num[0]); // 0 (default)
    num[0] = 1;
    num[1] = 2;
    num[2] = 3;

    for (int i : num) {
      System.out.println(i);
    }
  }

}
