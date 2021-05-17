package onedimensionalarray;

import java.util.Scanner;

/**
 * 功能介紹
 * 1. 可規定 數組 的長度
 * 2. 可輸入 參數總和 的平均值
 * 3. 算出那個參數 大於 平均值
 * */
public class AnalyzeNumbers {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the numbers of items: ");
    int n = input.nextInt(); // 先規定 array 的長度
    double[] numbers = new double[n]; // 規定長度
    double sum = 0;

    // 加總
    System.out.print("Enter the numbers: ");
    for (int i = 0; i < n; i++) {
      numbers[i] = input.nextDouble();
      sum += numbers[i]; // sum = sum + numbers[i]
    }
    
    double average = sum / n; // 計算平均值

    int count = 0; // The numbers of elements above average
    for (int i = 0; i < n; i++) {
      if (numbers[i] > average) { // 判斷參數是否大於 平均值
        count++;
      }
    }

    System.out.println("Average is " + average);  // 平均值 為多少？
    System.out.println("Number of elements above the average is " + count); // 有幾個參數大於平均值 ？
  }
}