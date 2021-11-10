package exception.finallydemo;

public class FinallyDemo {

    public static void main(String[] args) {
        try {
            int a = 1 / 0;
            System.out.println(a);
        } catch (RuntimeException ex) {
            System.out.println("----------");
            System.out.println("RuntimeException:" + ex);
            throw new RuntimeException(ex);
        } finally {
            System.out.println("Finally block executed!");//this line of code will be executed no matter what happens
        }
    }
}
