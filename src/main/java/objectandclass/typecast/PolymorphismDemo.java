package objectandclass.typecast;

import objectandclass.Course;

public class PolymorphismDemo {

  public static void main(String[] args) {
    model(new GraduateStudent());
    model(new Student());
    model(new Person());
    model(new Object()); // 這邊是直接回覆 Object 自身的 toString()

    // 和第9行代碼等價
    Object st = new Student();
    model(st);
    Student stv1 = (Student) st;

    Object o = new Course("wrong");//隐式转换 向上转换 upcasting
    Student stt = (Student) o;
//    m(o);
    if (o instanceof Student) { // false
      Student b = (Student) o;//显示转换 向下转换  downcasting
    }

  }


  public static void model(Object x) {
    System.out.println(x.toString());
  }
}


class GraduateStudent extends Student {
  public String toString() {
    return "GraduateStudent";
  }
}


class Student extends Person {
  public String toString() {
    return "Student";
  }
}


class Person extends Object {
  public String toString() {
    return "Person";
  }
}
