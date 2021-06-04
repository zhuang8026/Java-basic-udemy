package objectandclass.comparable;

public class ComparableRectangle extends Rectangle implements Comparable<ComparableRectangle> {

  /**
   * Construct a ComparableRectangle with specified properties
   */
  public ComparableRectangle(double width, double height) {
    super(width, height);
  }

  // 實現Comparable接口之後，就可以對 compareTo進行重寫
  @Override // Implement the compareTo method defined in Comparable
  public int compareTo(ComparableRectangle o) {

    if (this.getAreas() > o.getAreas()) {
      return 1;
    } else if (this.getAreas() < o.getAreas()) {
      return -1;
    } else {
      return 0;
    }
  }

  @Override // Implement the toString method in GeometricObject
  public String toString() {
    return "Width: " + getWidth() + " Height: " + getHeight() +
        " Area: " + this.getAreas();
  }

}
