package objectandclass.equalsdemo;

public class TestStudent {

  public static void main(String[] args) {
    // new Class 是一個對象
    Student student1 = new Student("Andrew", "Programming");
    Student student2 = new Student("Andrew", "Coding");
    Student student3 = new Student("Andrew", "Coding");

    System.out.println(student1.equals(student2));
    System.out.println(student2.equals(student3));
  }

}
