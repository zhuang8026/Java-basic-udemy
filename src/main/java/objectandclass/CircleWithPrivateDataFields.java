package objectandclass;

public class CircleWithPrivateDataFields {

  /**
   * The radius of the circle
   */
  private double radius = 1;

  /**
   * The number of the objects created
   */
  private static int numberOfObjects = 0;

  /**
   * Construct a circle with radius 1
   */
  public CircleWithPrivateDataFields() {
    this(1); // this 關鍵字是用於調用另一個構造方法：27行
                       // this 在構造方法中，必須必須放在所有可執行的語句的最前面，所以this不可和21行換位置
    numberOfObjects++;

  }

  /**
   * Construct a circle with a specified radius
   */
  public CircleWithPrivateDataFields(double radiussss) {
    this.radius = radiussss; // this 指向 類 本身，this 可不寫，是自動隱藏
//    numberOfObjects++;
    CircleWithPrivateDataFields.numberOfObjects++; // 靜態變量是不能使用this呼叫，必須使用類來引用
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
  public void setRadius(double newRadius) {
    radius = (newRadius >= 0) ? newRadius : 0;
  }

  /**
   * Return numberOfObjects
   */
  public static int getNumberOfObjects() {
    return numberOfObjects;
  }

  public static void setNumberOfObjects(int numberOfObjects) {
    if (numberOfObjects >= 0) {
      CircleWithPrivateDataFields.numberOfObjects = numberOfObjects;
    }

  }

  /**
   * Return the area of this circle
   */
  public double getArea() {
    return radius * radius * Math.PI;
  }
}
