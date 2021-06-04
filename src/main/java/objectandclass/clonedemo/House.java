package objectandclass.clonedemo;

import java.util.Date;

public class House implements Cloneable, Comparable<House> {

  private int id;
  private double area;
  private Date whenBuilt; // 引用 Date

  public House(int id, double area) {
    this.id = id;
    this.area = area;
    this.whenBuilt = new Date();
  }

  public int getId() {
    return id;
  }

  public double getArea() {
    return area;
  }

  public Date getWhenBuilt() {
    return whenBuilt;
  }

  @Override
  /** Override the protected clone method defined in
   the Object class, and strengthen its accessibility */
  public Object clone() {
    try {
      House houseClone = (House) super.clone(); // super 是指向Object
      houseClone.whenBuilt = (Date) whenBuilt.clone();
      return houseClone;
    } catch (CloneNotSupportedException ex) {
      return null;
    }
  }

  @Override // Implement the compareTo method defined in Comparable
  public int compareTo(House o) {
    if (area > o.area) {
      return 1;
    } else if (area < o.area) {
      return -1;
    } else {
      return 0;
    }
  }
}
