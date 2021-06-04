package objectandclass.extendsAndPolymorphism;

import java.util.Scanner;

public class PalindromeIgnoreNonAlphanumeric {

  /**
   * Main method
   */
  public static void main(String[] args) {
    // Create a Scanner
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter a string
    System.out.print("Enter a string: ");
    String s = input.nextLine();

    boolean bo = isPalindrome(s);

    // Display result
    System.out.println("Ignoring non-alphanumeric characters, \nis "
        + s + " a palindrome? " + bo);
  }

  /**
   * Return true if a string is a palindrome
   */
  public static boolean isPalindrome(String s) {
    // Create a new string by eliminating non-alphanumeric chars
    String s1 = filter(s);

    // Create a new string that is the reversal of s1
    String s2 = reverse(s1);

    // Compare if the reversal is the same as the original string
    return s2.equals(s1);
  }

  /**
   * Create a new string by eliminating non-alphanumeric chars
   */
  public static String filter(String s) {
    // Create a string builder
    StringBuilder stringBuilder = new StringBuilder();

    // Examine each char in the string to skip alphanumeric char
    // Character 是char 的包裝類
    for (int i = 0; i < s.length(); i++) {
      if (Character.isLetterOrDigit(s.charAt(i))) { // 判斷 String 是否有char or int
                                                    // java.lang.Character.isLetterOrDigit(char ch) 確定指定的字符是否為字母或數字。
        stringBuilder.append(s.charAt(i));
      }
    }

    // Return a new filtered string
    return stringBuilder.toString();
  }

  /**
   * Create a new string by reversing a specified string
   */
  public static String reverse(String s) {
    StringBuilder stringBuilder = new StringBuilder(s);
    stringBuilder.reverse(); // Invoke reverse in StringBuilder
    return stringBuilder.toString();
  }
}
