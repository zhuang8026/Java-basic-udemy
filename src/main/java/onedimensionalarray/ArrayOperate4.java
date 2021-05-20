package onedimensionalarray;

public class ArrayOperate4 {

  public static void main(String[] args) {
    double myList[] = new double[10];

    for (int i = 0; i < myList.length; i++) {
      myList[i] = Math.random() * 100;
    }

    double max = myList[0]; // Java中的double原语永远不能为null
    System.out.println(max);
    for (int i = 1; i < myList.length; i++) {
      if (myList[i] > max) {
        max = myList[i]; // 賦值 給 max, 並且一直循環(10次)
      }
    }

    for (int i = 0; i < myList.length; i++) {
      System.out.print(myList[i] + ",");
    }

    System.out.println();

    System.out.println("max=" + max);


  }

}
