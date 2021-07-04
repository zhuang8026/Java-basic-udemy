package reflection;

import java.lang.annotation.ElementType;

public class Test04 {

  public static void main(String[] args) {
    Class c1 = Object.class;
    Class c2 = Comparable.class;
    Class c3 = String[] .class;
    Class c4 = int[][].class;
    Class c5 = Override.class;
    Class c6 = ElementType.class;
    Class c7 = Integer.class;
    Class c8 = void.class;
    Class c9 = Class.class; //Class

    System.out.println(c1); // class java.lang.Object
    System.out.println(c2); // interface java.lang.Comparable
    System.out.println(c3); // class [Ljava.lang.String; 一維數組
    System.out.println(c4); // class [[I 二維數組
    System.out.println(c5); // interface java.lang.Override
    System.out.println(c6); // class java.lang.annotation.ElementType
    System.out.println(c7); // class java.lang.Integer
    System.out.println(c8); // void
    System.out.println(c9); // class java.lang.Class

  }
}
