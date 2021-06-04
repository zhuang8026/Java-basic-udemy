package objectandclass.interfacedemo;

import java.util.Arrays;

public class TestEdible {

  public static void main(String[] args) {
    Object[] objects = {new Tiger(), new Chicken(), new Apple()};

    for (int i = 0; i < objects.length; i++) {
      // instanceof 是判斷是否為 XXXX 類別
      if (objects[i] instanceof Edible) {
        System.out.println(((Edible) objects[i]).howToEat());
      }

      if (objects[i] instanceof Animal) {
        System.out.println(((Animal) objects[i]).sound());
      }
    }
  }

}
