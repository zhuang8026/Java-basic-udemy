package generic;

import java.util.ArrayList;

public class GenericsDemo {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        //This works fine because add a String
        arrayList.add("Andrew Programming");
        //This leads an error since add an integer
        // we can detect the error in compile time instead of runtime
        //arrayList.add(1);

        ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        for (Object ls : list) {
            System.out.println(ls);
        }
        for (String lsv2 : arrayList) {
            System.out.println(lsv2);
        }
        System.out.println("------------");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
