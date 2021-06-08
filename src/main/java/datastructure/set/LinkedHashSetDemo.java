package datastructure.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        Set<String> linkhashset = new LinkedHashSet();
        linkhashset.add("one");
        linkhashset.add("two");
        linkhashset.add("three");

        linkhashset.add("four");
        linkhashset.add("five");
        linkhashset.add("six");

        System.out.println(linkhashset); // [one, two, three, four, five, six]

        Set<String> hashset = new HashSet();
        hashset.add("one");
        hashset.add("two");
        hashset.add("three");

        hashset.add("four");
        hashset.add("five");
        hashset.add("six");

        System.out.println(hashset); // [six, four, one, two, three, five]

    }
}
