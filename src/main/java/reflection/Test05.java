package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test05 {

  public static void main(String[] args)
      throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
    Class c1 = Class.forName("reflection.User");

    System.out.println(c1.getName());//获得包名+类名
    System.out.println(c1.getSimpleName()); //获得类名

    //获得类的属性
    System.out.println("===============================");
    Field[] fields = c1.getDeclaredFields(); // 獲取類內部的參數 => public + private
    Field[] fieldsv2 = c1.getFields(); // 獲取類內部的參數 => public

    for (Field item : fields) {
      System.out.println(item);
    }

    System.out.println("=============获取指定的属性值================");

    Field name = c1.getDeclaredField("name"); // 獲取指定 參數
    System.out.println(name);

    System.out.println("=============获取类的方法================");
    Method[] methods = c1.getMethods();  // 全都都取得，包括 User 和 User的父類 (Object)
                                         // 非私有方法(!private)
    for (Method item : methods) {
      System.out.println(item);
    }

    System.out.println("=============获取當前类(reflection.User)的方法,使用getDeclaredMethods================");

    Method[] methods1 = c1.getDeclaredMethods(); // 只會取得和 reflection.User 有關的 methods
                                                 // 包括 private
    for (Method item : methods1) {
      System.out.println(item);
    }

    System.out.println("=============获取类的指定方法================");

    Method getName = c1.getMethod("getName", null); // getMethod(取得方法, 傳入是否有參數？ String.class : null)
    System.out.println(getName);

    Method setName = c1.getMethod("setName", String.class);
    System.out.println(setName);

    System.out.println("=============获取构造器================");

    Constructor[] constructors = c1.getConstructors(); // 取得內部的構造函數(public)
    for (Constructor item : constructors) {
      System.out.println("getConstructors:" + item);
    }

    Constructor[] constructors1 = c1.getDeclaredConstructors(); // 取得內部的構造函數(public+private)
    for (Constructor item : constructors1) {
      System.out.println("getDeclaredConstructors:" + item);
    }

    Constructor declaredConstructor = c1.getDeclaredConstructor(String.class, String.class, int.class); // 其德指定構造函數
    System.out.println("指定构造器: " + declaredConstructor);
  }
}
