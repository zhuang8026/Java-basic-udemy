package objectandclass.extendsAndPolymorphism;

import objectandclass.extendsAndPolymorphism.SimpleGeometricObject;

public class CircleFromSimpleGeometricObject extends SimpleGeometricObject {

  private double radius;

  public CircleFromSimpleGeometricObject() {
  }

  public CircleFromSimpleGeometricObject(double radius) {
    this.radius = radius;
  }

  public CircleFromSimpleGeometricObject(double radius,  String color, boolean filled) {
    this.radius = radius;
    setColor(color);
    setFilled(filled);
  }

  /**
   * Return radius
   */
  public double getRadius() {
    return radius;
  }

  /**
   * Set a new radius
   */
  public void setRadius(double radius) {
    this.radius = radius;
  }

  /**
   * Return area
   */
  public double getArea() {
    return radius * radius * Math.PI;
  }

  /**
   * Return diameter
   */
  public double getDiameter() {
    return 2 * radius;
  }

  /**
   * Return perimeter
   */
  public double getPerimeter() {
    return 2 * radius * Math.PI;
  }

  /* Print the circle info */
  public void printCircle() {
    System.out.println("The circle is created " + getDateCreated() + " and the radius is " + radius);
    super.getDateCreated();
  }

  // @Override 是重寫方法
  @Override
  public String toString() {
    toString(); // 這樣是調用自身
    super.toString(); // 這樣是調用 父類的toString方法
    return "CircleFromSimpleGeometricObject{" + "radius=" + radius + '}';
  }

  public static void getTestStatic() {
    SimpleGeometricObject.getTestStatic(); // 調用父類的靜態方法
    System.out.println("子類的 getTestStatic");
  }

}
