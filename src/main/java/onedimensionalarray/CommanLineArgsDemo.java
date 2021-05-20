package onedimensionalarray;

public class CommanLineArgsDemo {

  public static void main(String[] args) {
    String [] city = {"New York","Boston","Atlanta"};
    CommanLineArgsDemoB.main(city);
//    CommanLineArgsDemoB.test(city); // error

    System.out.println();

    CommanLineArgsDemoB cb = new CommanLineArgsDemoB();
    cb.test(city);
  }
}
