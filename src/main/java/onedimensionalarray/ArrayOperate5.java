package onedimensionalarray;

public class ArrayOperate5 {

  public static void main(String[] args) {
    double[] myList = {1, 5, 3, 4, 5, 6};

    double max = myList[0]; // 1
    int indexOfMax = 0;

    for (int i = 1; i < myList.length; i++) {
      if (myList[i] > max) { // 5, 3, 4, 5, 6 > 1
        max = myList[i]; // max = 5, 3, 4, 5, 6
        indexOfMax = i; // indexOfMax = 1, 2, 3, 4, 5

      }
    }

    System.out.println("max = " + max + " indexOfMax = " + indexOfMax);
  }

}
