package generic;

public class GenericStaticMethodDemo {

  public static void main(String[] args) {

    Integer[] integers = {1,2,3,4,5};
    String[] strings = {"London","Tokyo","New York"};

    // 泛型 static
    GenericStaticMethodDemo.<Integer>print(integers);
    GenericStaticMethodDemo.<String>print(strings);

    // 一般 static
    GenericStaticMethodDemo.printNormal(integers);
  }

  // 泛型 靜態函數
  public static <E> void print(E[] list){
    for (int i=0;i<list.length;i++){
      System.out.print(list[i]+" ");
    }
    System.out.println("----");
  }

  // 一般 靜態函數
  public static void printNormal(Integer[] list){
    for (int i=0;i<list.length;i++){
      System.out.print(list[i]+" ");
    }
  }
}
