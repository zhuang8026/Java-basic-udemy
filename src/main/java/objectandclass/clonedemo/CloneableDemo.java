package objectandclass.clonedemo;

import java.util.Arrays;
import java.util.Date;

public class CloneableDemo {

  public static void main(String[] args) {
    Date ins1 = new Date();
    Date ins2 = (Date) ins1.clone(); // ins1.clone() 拷貝出來之後是Object,所以需要強行轉換
    System.out.println(ins1 == ins2);

    int[] list1 = {1, 2};
    int[] list2 = list1.clone();

    list1[0] = 7;
    list2[0] = 8;

    System.out.println(Arrays.toString(list1));
    System.out.println(Arrays.toString(list2));
  }

}
