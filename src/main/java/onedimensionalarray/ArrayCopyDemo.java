package onedimensionalarray;

public class ArrayCopyDemo {

  public static void main(String[] args) {
    int[] sourceArray = {2, 3, 1, 5, 10};
    int[] targetArray = new int[sourceArray.length];

// 方法一
/*    //use for loop
    for (int i = 0; i < sourceArray.length; i++) {
      targetArray[i] = sourceArray[i];
    }

    for (int e : sourceArray) {
      System.out.print(e + " ");
    }*/

// 方法二
    System.arraycopy(sourceArray, 0, targetArray, 0, sourceArray.length);

    for (int e : sourceArray) {
      System.out.print(e + " ");
    }
  }

}
