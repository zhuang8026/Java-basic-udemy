package wills;

public class 包裝類測試_Integer {

  public static void main(String[] args) {
    System.out.println(Integer.MAX_VALUE);
    System.out.println(Integer.MIN_VALUE);

    Integer num = 123456;
    byte bb = num.byteValue();
    System.out.println(bb);

    short sh = num.shortValue();
    System.out.println(sh);

    int it = num.intValue();
    System.out.println(it);

    long lo = num.longValue();
    System.out.println(lo);

    float fl = num.floatValue();
    System.out.println(fl);

    double dou = num.doubleValue();
    System.out.println(dou);

    Integer a = 1;
    Integer b = 2;
    System.out.println(a.compareTo(b)); // -1 0 1

    Integer x = Integer.valueOf("999");
    Integer xx = Integer.valueOf("999", 16);
    System.out.println(xx);
  }

}
