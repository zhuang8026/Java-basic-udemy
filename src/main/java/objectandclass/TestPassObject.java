package objectandclass;

public class TestPassObject {

  /**
   * Main method
   */
  public static void main(String[] args) {
    // Create a Circle object with radius 1
    CircleWithPrivateDataFields myCircle = new CircleWithPrivateDataFields(1);

    // Print areas for radius 1, 2, 3, 4, and 5.
    int n = 5;
    printAreas(myCircle, n);

    // See myCircle.radius and times
    System.out.println("\n" + "Radius is " + myCircle.getRadius());
    System.out.println("n is " + n);
  }

  /**
   * Print a table of areas for radius
   */
  public static void printAreas(CircleWithPrivateDataFields c, int times) {
    System.out.println("Radius \t\tArea");

    // 5 4 3 2 1 0 => 6次
    while (times >= 1) {
      System.out.println(c.getRadius() + "\t\t" + c.getArea());
      c.setRadius(c.getRadius() + 1);
      times--;
    }
  }
}
