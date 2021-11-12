package java8;

interface Sayable {
    // Default method
    default void say() {
        System.out.println("Hello, this is default method");
    }

    // Abstract method 抽象方法
    void sayMore(String msg);

    // 如果不是 Default，就必須是 static
    static void sayLounder(String msg) {
        System.out.println(msg);
    }


}

public class SayableDemo implements Sayable {

    // 接口裡面的方法 強制重寫(非default & 非sayLounder)
    public void sayMore(String msg) {        // implementing abstract method
        System.out.println(msg);
    }

    @Override
    public void say() {
        System.out.println("my say");
    }

    public static void main(String[] args) {
        Sayable dm = new SayableDemo();
        dm.say();   // calling default method
        dm.sayMore("Work is worship");  // calling abstract method
        Sayable.sayLounder("say lounder!");
    }
}
