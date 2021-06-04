package objectandclass.constructorMethod;

public class Faculty extends Employee {

  public static void main(String[] args) {
    new Faculty();
  }

  public Faculty() {
    System.out.println("(4) Faculty's no-arg constructor is invoked"); // 5
  }
}


class Employee extends Person {
  public Employee() {
    // 在constructor中不能同時建構constructor
    // this 是呼叫自己的 constructor
    // super 是呼叫父類的 constructor
    // super("我是測試1號");
    this("(2) Invoke Employee’s overloaded constructor");
    System.out.println("(3) Employee's no-arg constructor is invoked"); // 3
    super.printPersion("我是測試2號"); // 4
  }


  public Employee(String s) {
    super("我是測試1號");
    System.out.println("(2) Employee: " + s); // 2
  }
}


class Person {
  public Person() {
    System.out.println("(1) Person's no-arg constructor is invoked");
  }

  public Person(String str) {
    System.out.println("(1) william test:" + str); // 1
  }

  public void printPersion (String str){
    System.out.println("(1) printPersion: " + str);
  }
}
