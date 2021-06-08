package datastructure.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<String>  hashset = new HashSet<>();
        hashset.add("one");  // 新增
        hashset.add("two");
        hashset.add("three");

        hashset.add("one");

        System.out.println(hashset); // [one, two, there]

        hashset.remove("one"); // 刪除單筆
        System.out.println(hashset);

        System.out.println(hashset.contains("two1")); // boolen 判斷是否有"two1"

        Set<String> hashset2 = new HashSet<>();
        hashset2.add("three");
        hashset2.add("four");
        hashset2.add("five");

        hashset.removeAll(hashset2); // ["two"], "hashset"刪除和"hashset2"內容一樣的參數
        System.out.println(hashset);

        hashset.addAll(hashset2); // "hashset2"加入到 "hashset" 中
        System.out.println(hashset);

        hashset.retainAll(hashset2); // 取交集
        System.out.println(hashset);




    }
}
