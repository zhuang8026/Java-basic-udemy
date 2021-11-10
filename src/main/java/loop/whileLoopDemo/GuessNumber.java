package loop.whileLoopDemo;

import java.util.Scanner;

public class GuessNumber {

//  public static void main(String[] args) {
//    // Generate a random number to be guessed
//    int number = (int) (Math.random() * 101); // 隨即數
//
//    Scanner input = new Scanner(System.in);
//    System.out.println("Guess a magic number between 0 and 100");
//
//    int guess = -1;
//    while (guess != number) {
//      // Prompt the user to guess the number
//      System.out.print("\nEnter your guess: ");
//      guess = input.nextInt();
//
//      if (guess == number) {
//        System.out.println("Yes, the number is " + number);
//      } else if (guess > number) {
//        System.out.println("Your guess is too high");
//      } else {
//        System.out.println("Your guess is too low");
//      }
//    } // End of loop
//  }

    public static void main(String[] args) {
        int number = (int) (Math.random() * 100);
        Scanner input = new Scanner(System.in);
        int guess = -1;
        while (guess != number) {
            System.out.println("請輸入你猜測的值：");
            guess = input.nextInt();
            if (guess == number) {
                System.out.println("配對成功");
            } else if (guess > number) {
                System.out.println("太大了");
            } else {
                System.out.println("太小了");
            }
        }
    }
}