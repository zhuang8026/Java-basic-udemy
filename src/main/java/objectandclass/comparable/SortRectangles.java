package objectandclass.comparable;

import java.util.Arrays;

public class SortRectangles {

  public static void main(String[] args) {
    ComparableRectangle[] rectangles = {
        new ComparableRectangle(3.4, 5.4),
        new ComparableRectangle(13.24, 55.4),
        new ComparableRectangle(7.4, 35.4),
        new ComparableRectangle(1.4, 25.4),
    };

    Arrays.sort(rectangles); // sort 自身有 implements Comparable，所以在使用sort方法的時候，會使用 compareTo 和 toString

    for (Rectangle rec : rectangles) {
      System.out.println(rec + " ");
      System.out.println();
    }
  }
}
