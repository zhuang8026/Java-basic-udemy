package datastructure.iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {

  public static void main(String[] args) {
    Collection<String> collection = new ArrayList<>();

    collection.add("Beijing");
    collection.add("Taibei");
    collection.add("New York");

    Iterator<String> iterator = collection.iterator(); // iterator() 轉成iterator 對象
    while (iterator.hasNext()) {
//      String str = (String) iterator.next();
//      System.out.println(str.toUpperCase());
      System.out.println(iterator.next().toUpperCase());
    }
  }

}
