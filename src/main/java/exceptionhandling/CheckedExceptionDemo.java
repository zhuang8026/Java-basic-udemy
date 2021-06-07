package exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptionDemo {

  public static void main(String[] args)
      throws FileNotFoundException  // 解決 必检异常 一
  {

    //免检异常 checked exception
    //必检异常 unchecked exception
    File file = new File("E://file.txt");

    // 解決 必检异常 一
    FileReader fr = new FileReader(file); // FileReader -> 必检异常

    // 解決 必检异常 二
    //    try {
    //      FileReader fr = new FileReader(file); // FileReader -> 必检异常
    //    } catch (FileNotFoundException e) {
    //      e.printStackTrace();
    //    }


  }


}
