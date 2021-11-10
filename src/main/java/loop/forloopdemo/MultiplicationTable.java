package loop.forloopdemo;

public class MultiplicationTable {

    /**
     * Main method
     * 99 乘法表
     */
    public static void main(String[] args) {
        // Display the table heading
        System.out.println("           Multiplication Table");

        // 99乘法表 title
        System.out.print("    ");
        for (int j = 1; j <= 9; j++) {
            System.out.print("   " + j);
        }

        System.out.println("\n-----------------------------------------");

        // 99乘法表 body
        for (int i = 1; i <= 9; i++) {
            System.out.print(i + " | ");
            for (int j = 1; j <= 9; j++) {
                // Display the product and align properly
                System.out.printf("%4d", i * j); // "%d" 是用於字串
            }
            System.out.println();
        }
    }
}
