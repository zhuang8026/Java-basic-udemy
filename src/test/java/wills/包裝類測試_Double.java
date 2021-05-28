package wills;

public class 包裝類測試_Double {

  public static void main(String[] args) {
    Double dd = new Double(1.1);
    System.out.println(dd);

    Double ddd = new Double("1.11");
    System.out.println(ddd);

    byte by = dd.byteValue();
    short sh = dd.shortValue();
    int in = dd.intValue();
    long lo = dd.longValue();
    float fl = dd.floatValue();
    double dou = dd.doubleValue();
    String str = dd.toString();

    Double a = new Double(1.1);
    Double b = new Double(2.2);
    int boo = a.compareTo(b);
    Double do1 = Double.valueOf("3.3");
    Double do2 = Double.parseDouble("4.4");

    int bo3 = a.compareTo(b);
  }

}
