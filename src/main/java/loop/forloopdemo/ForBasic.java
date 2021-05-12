package loop.forloopdemo;

import java.util.ArrayList;
import java.util.List;

public class ForBasic {

  public static void main(String[] args) {
    System.out.println("----------------> 寫法一");
    for (int i = 1; i < 11; i++) {
      System.out.println("Count is:" + i);
    }

    System.out.println("----------------> 寫法二");

    for (int i = 1, j = 2; i < 11; i++, System.out.println("Count is:" + i + "-" + j));

    System.out.println("----------------> 寫法三");

    String[] nums = {"1.01", "2.02", "3.03"};
    for (String num : nums) {
      System.out.println(num);
    }

    System.out.println("----------------> 寫法四");

    List<String> arrlist = new ArrayList();
    arrlist.add("william-1");
    arrlist.add("william-2");
    arrlist.add("william-3");
    for(String item : arrlist){
      System.out.println(item);
    }
  }
}
