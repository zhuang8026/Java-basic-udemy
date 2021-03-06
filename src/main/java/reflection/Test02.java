package reflection;

public class Test02 {


    public static void main(String[] args) throws ClassNotFoundException {
        Person student = new Student();

        System.out.println("这个人是" + student.name);

        // 測試開始
        Class c1 = student.getClass();
        System.out.println(c1.hashCode());

        Class c2 = Class.forName("reflection.Student");
        System.out.println(c2.hashCode());

        Class c3 = Student.class;
        System.out.println(c3.hashCode());

        Class c4 = Integer.TYPE;
        System.out.println(c4);

        Class c44 = Character.TYPE;
        System.out.println(c44);

        Class c5 = c1.getSuperclass();
        System.out.println(c5); // class reflection.Person


    }


}


class Person {

    public String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}


class Teacher extends Person {

    public Teacher() {
        this.name = "老师";
    }
}


class Student extends Person {

    public Student() {
        this.name = "学生";
    }
}


