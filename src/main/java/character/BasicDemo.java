package character;

public class BasicDemo {

  public static void main(String[] args) {
    char letter1 = 'A'; // char < string
    char letter2 = '\u0042'; // B , unicode '|u' => unicode編輯開始, '0042' => 16字節/一個數字為4字節
    System.out.println("letter2:" + letter2);

    System.out.println("--letter2:" + --letter2);
    System.out.println("u0042: " + (int)'\u0042'); // 66 B
    System.out.println((char) 65); // A

    System.out.println('\u1003'); // https://unicode-table.com/en/#1003

    //He said "Java" is fun
    System.out.println("He said\t \"Java\" is\n fun \\");

    char ch = (char) 0X0041;
    System.out.println(ch);

    byte b = (byte) '\uFFF4';
    System.out.println(b);
    System.out.println('\uFFF4');
    System.out.println(Math.pow(2, 8));

    char c1 = '\uFF13';
    //System.out.println('\u10002');
    System.out.println(c1);
//
//
    /*
    Character : 字符串的包裝類
    toChars: 因為 '\uFF13' 最多只能4個數字，當unicode大約4個字的時候，可以是有 character.toChars()
    */
    char[] math_fraktur_cap_g = Character.toChars(0x10280); // '0x' 表示 16 進制數
    System.out.println(math_fraktur_cap_g); // uniocde icon

    char ch2 = (char) 0xAB0041;
    System.out.println(ch2); // A

    char ch3 = (char) 65.25;
    System.out.println(ch3); // A

    int i = (int) 'A'; // 其實 (int) 強轉是多餘的，可以不用寫
                       // 因為 'A' 的16進制是 65, 但如果 參數本身大小 > int, 就要寫(int),例如 '\uFF01';
    System.out.println("i=" + i); // 65

    byte j = (byte) '\uFF01';
    System.out.println("j=" + j); // FF01容量 > byte, 就算都有答案，也是錯誤的

    int k = '2'+'3';
    System.out.println( "k=" + k ); // 101

    int k1 = 2+'a'; // unicode
    System.out.println( (char)k1 ); // C  (99的unicode)
    System.out.println( k1 );       // 99 (C的數值)

    System.out.println("Andrew "+'5'); //

    //字符的比较和测试
    System.out.println('a'<'b');
    System.out.println('a'>'b');
    System.out.println('a'>='b');
    System.out.println('a'<='b');
    System.out.println('a'=='b');

    System.out.println("==================");

    System.out.println(Character.isDigit('8'));
    System.out.println(Character.isUpperCase('A'));
    System.out.println(Character.isLowerCase('a'));
  }
}
