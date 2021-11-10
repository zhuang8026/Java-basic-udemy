package classload;

public class Test06 {

    public static void main(String[] args) throws ClassNotFoundException {
        //获取系统类加载器 System
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader(); // 當前 加載器
        System.out.println(systemClassLoader);

        //获取拓展类加载器 Extension
        ClassLoader parent = systemClassLoader.getParent();  // 當前 父類的加載器
        System.out.println(parent);

        //获取根加载器 Bootstarp
        ClassLoader bootstrap = parent.getParent(); // parent 父類的加載器
        System.out.println(bootstrap); // null 因為 Bootstarp 是C++ 編譯，所以獲取不到


        System.out.println("======================================");


        //测试当前类是哪个类加载器所加载
        ClassLoader cl1 = Class.forName("classload.Test06").getClassLoader();
        System.out.println(cl1); // System

        //测试JDK内置的类是谁加载的
        ClassLoader cl2 = Class.forName("java.lang.Object").getClassLoader();
        System.out.println("cl2:" + cl2); // null

        ClassLoader cl3 = Class.forName("java.lang.String").getClassLoader();
        System.out.println("cl3:" + cl3); // null

        //如何获得 系统类加载器 可以加载的 路徑
        System.out.println(System.getProperty("java.class.path"));
    }
}
