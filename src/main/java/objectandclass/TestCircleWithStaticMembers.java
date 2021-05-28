package objectandclass;

public class TestCircleWithStaticMembers {

  /**
   * Main method
   */
  public static void main(String[] args) {
    System.out.println("Before creating objects");
    System.out.println("The number of Circle objects is " +  CircleWithStaticMembers.numberOfObjects); // 重點一： 如果 變量本身是 static, 那就不用 new class (實例化)

    // Create c1
    CircleWithStaticMembers c1 = new CircleWithStaticMembers(); // 實例化並啟動裡面的默認構造行數 (new class)

    // Display c1 BEFORE c2 is created
    System.out.println("\nAfter creating c1");
    System.out.println("c1: radius (" + c1.radius + ") and number of Circle objects (" +  c1.numberOfObjects + ")"); // 重點二： 如果 變量本身不是 static, 那就需要 new class (實例化)

//    CircleWithStaticMembers.numberOfObjects  =-10;

    // Create c2
    CircleWithStaticMembers c2 = new CircleWithStaticMembers(5);

    // Modify c1
    c1.radius = 9; // 因為已經分別實例化了，所以不會c1修改不會影響到c2

    // Display c1 and c2 AFTER c2 was created
    System.out.println("\nAfter creating c2 and modifying c1");
    System.out.println("c1: radius (" + c1.radius + ") and number of Circle objects (" + c1.numberOfObjects + ")");
    System.out.println("c2: radius (" + c2.radius + ") and number of Circle objects (" +  c2.numberOfObjects + ")");
  }
}
