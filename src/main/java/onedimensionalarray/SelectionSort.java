package onedimensionalarray;

public class SelectionSort {

  /**
   * The method for sorting the numbers
   */
  public static void selectionSort(double[] list) {
    for (int i = 0; i < list.length - 1; i++) {
      // Find the minimum in the list[i..list.length-1]
      double currentMin = list[i];  // i=0; 4.4
      int currentMinIndex = i;      // 0

      for (int j = i + 1; j < list.length; j++) {
        if (currentMin > list[j]) { // 4.4 > 2.2
          currentMin = list[j];     // currentMin = 2.2
          currentMinIndex = j;      // currentMinIndex = 1
        }
      }

      // Swap list[i] with list[currentMinIndex] if necessary;
      if (currentMinIndex != i) {        // 1 != 0
        list[currentMinIndex] = list[i]; // list[1] = 4.4
        list[i] = currentMin;            // list[0] = 2.2
      }

      System.out.print(list[i] + ", ");
    }
  }

  public static void main(String[] args) {
    double[] list = {4.4, 2.2, 3.3, 1.1, 8.8, 5.5};
    selectionSort(list);
  }
}
