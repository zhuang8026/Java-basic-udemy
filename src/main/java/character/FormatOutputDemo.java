package character;

public class FormatOutputDemo {

    public static void main(String[] args) {
        double amount = 12618.98;
        double interestRate = 0.0013;
        double interest = amount * interestRate;

//    System.out.println("Interest is $" + (int) (interest * 100) / 100.0);

        System.out.printf("Interest is %4.2f", interest); // Interest is 16.40
        // 4.2 => 4 為數字的寬度, .2 為保留幾位小數
        System.out.println();
        System.out.printf("%3d # %2s # %4.2f \n", 1234, "Java", 51.6653); // 1234 # Java # 51.67
        // %d 用於『int』的佔位符號
        // %S 用於『字串』的佔位符號

        System.out.printf("%8d %8s %8.1f\n", 1234, "Java", 5.63); // 8s 字符串數量為8，不足會自動補齊
        System.out.printf("%-8d%-8s%-8.1f\n", 1234, "Java", 5.63); // '%-8d'中的'-' 是向左對齊

//    int a = (int)'3' - '2';
//    float b = (float)'m' / 'n';
//    System.out.println(a); // 1
//    System.out.println(b); // 0.9909091
//    System.out.println((int) '3'); // 51
//    System.out.println((int) '2'); // 50
//    System.out.println((int) 'm'); // 109
//    System.out.println((int) 'n'); // 110
//    System.out.println((float) 109 / 110); // 0.9909091
//    System.out.println((float)1 / 2); // 0
        System.out.println("Java " + 1 + 2 + 3);
        System.out.println("abc".compareTo("aba"));
    }

}
