package java8;

interface talk {

}

@FunctionalInterface
interface sayable extends talk {
    /**
     * 1. 接口裡面的方法 強制重寫(非default & 非sayLounder)
     * 2. 抽象方法 只能寫在一個 接口內
     * */
    void say(String msg);   // abstract method

    // It can contain any number of Object class methods.
    int hashCode();

    String toString();

    boolean equals(Object obj);

    static void sayHi() {
        System.out.println("Hi");
    }
}

public class FunctionalInterfaceExample2 implements sayable {
    public void say(String msg) {
        System.out.println(msg);
    }

    public static void main(String[] args) {
        FunctionalInterfaceExample2 fie = new FunctionalInterfaceExample2();
        fie.say("Hello there");
    }
}  