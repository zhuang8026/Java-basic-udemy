package exception.throwsAnException;

public class ThrowsAnExceptionDemo {

    public void deposit(int amount) throws RuntimeException {
        // Method implementation
        try {
            System.out.println(1 / amount); // error , 0 不能作為除數
        } catch (RuntimeException e) {
            System.out.println("我不处理这个异常，留给调用者处理吧！");
            throw e;
        }

    }

    // Remainder of class definition
    public static void main(String[] args) {
        ThrowsAnExceptionDemo throwsAnExceptionDemo = new ThrowsAnExceptionDemo();
        try {
            throwsAnExceptionDemo.deposit(0); // deposit 會拋出異常
        } catch (RuntimeException e) {
            System.out.println("main method handle it!");
            throw e;
        }
    }


}
