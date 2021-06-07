package exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExceptionDemo {

  public static void main(String[] args) {
//    Scanner input = new Scanner(System.in);
    boolean continueInput = true;

    do {
      try {
        System.out.print("Enter an integer: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        // Display the result
        System.out.println("The number entered is " + number);

        continueInput = false;
      } catch (InputMismatchException ex) {
//        ex.printStackTrace();
        System.out.println("Try again. (Incorrect input: an integer is required)");
//        input.nextLine(); // discard input
                          // input 要等你輸入東西，如果不使用 nextLine，參數會一直保留在 input 中

      }
    } while (continueInput);
  }
}
