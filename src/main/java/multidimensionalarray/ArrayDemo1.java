package multidimensionalarray;

import java.util.Scanner;

public class ArrayDemo1 {

  public static void printArray(double[][] matrix) {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    double[][] matrix = new double[2][2];

    java.util.Scanner input = new Scanner(System.in);
    System.out.println("Enter " + matrix.length + " rows and " + matrix[0].length + " columns: ");
    for (int row = 0; row < matrix.length; row++) {
      for (int column = 0; column < matrix[row].length; column++) {
        matrix[row][column] = input.nextInt();
      }
    }

    printArray(matrix);

    int sum = 0;
    for (int row = 0; row < matrix.length; row++) {
      for (int column = 0; column < matrix[row].length; column++) {
        sum += matrix[row][column];
      }
    }

    System.out.println("sum = " + sum);

    for (int column = 0; column < matrix[0].length; column++) { // 水平
      int total = 0;
      for (int row = 0; row < matrix.length; row++) { // 垂直
        total += matrix[row][column]; // matrix[0][0] and matrix[1][0]
      }
      System.out.println("Sum for column " + column + " is " + total);
    }

    int maxRow = 0; // 當前行的最大總和
    int indexOfMaxRow = 0; // 當前行的下標

    for (int column = 0; column < matrix[0].length; column++) { // 第一行的最大值
      maxRow += matrix[0][column];
    }

    // 從第二行開始計算，上面已經第一行
    for (int row = 1; row < matrix.length; row++) {
      int totalOfThisRow = 0; // 當前行數的最大值
      for (int column = 0; column < matrix[row].length; column++) {
        totalOfThisRow += matrix[row][column]; // matrix[1][0] && matrix[1][1]
      }

      // 比較誰大
      if (totalOfThisRow > maxRow) {
        maxRow = totalOfThisRow;
        indexOfMaxRow = row;
      }
    }

    System.out.println("Row=" + indexOfMaxRow + " maxValue = " + maxRow);

    // 隨即生成參數下標，參數在數組中無須排列
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        int i1 = (int) (Math.random() * matrix.length); // Y 軸
        int j1 = (int) (Math.random() * matrix[i].length); // X 軸
        // Swap matrix[i][j] with matrix[i1][j1]
        double temp = matrix[i][j];

        // 參數替換
        // 1234
        // 1 = 2 , 2 = 1, 不這麼做, 1會消失
        matrix[i][j] = matrix[i1][j1]; // 隨即下標
        matrix[i1][j1] = temp; // 保存原始參數
      }
    }

    printArray(matrix);

  }

}
