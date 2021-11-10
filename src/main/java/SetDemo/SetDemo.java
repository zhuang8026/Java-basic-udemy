package SetDemo;

import java.util.*;

public class SetDemo {

    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();

        hashSet.add("a");
        hashSet.add("a");

        hashSet.remove("a");

        System.out.println(hashSet.size());

        System.out.println(hashSet);

        hashSet.add("a");
        hashSet.add("h");
        hashSet.add("b");
        hashSet.add("a");
        hashSet.add("c");
        hashSet.add("f");
        hashSet.add("w");
        hashSet.add("j");

        System.out.println(hashSet);

        Set<String> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add("y");
        linkedHashSet.add("e");
        linkedHashSet.add("f");
        linkedHashSet.add("g");
        linkedHashSet.add("h");
        linkedHashSet.add("k");
        linkedHashSet.add("a");

        System.out.println(linkedHashSet);

        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(4);
        treeSet.add(3);
        treeSet.add(2);
        treeSet.add(1);
        System.out.println(treeSet);

        Set<String> stringTreeSet = new TreeSet<>();

        stringTreeSet.add("f");
        stringTreeSet.add("e");
        stringTreeSet.add("a");
        stringTreeSet.add("b");
        stringTreeSet.add("c");

        System.out.println(stringTreeSet);

        Set<Student> customTreeSet = new TreeSet(new Comparator<Student>() {

            @Override
            public int compare(Student o1, Student o2) {
                return o2.getScore() - o1.getScore();
            }
        });

        Student a1 = new Student(33, "a", 18);
        Student a2 = new Student(32, "b", 23);

        System.out.println("------hashcode---------");

        customTreeSet.add(a1);
        customTreeSet.add(a2);
        System.out.println(customTreeSet);

        Iterator<Student> itr = customTreeSet.iterator();
//		while (itr.hasNext()) {
//			System.out.println("hashcode: " + itr.next());
//		}
//		customTreeSet.removeIf(st -> "a".equals(st.getName()));

        while (itr.hasNext()) {
            Student st = itr.next();
            String str1 = st.getName();
            if ("a".equals(str1)) {
                itr.remove();
            }
        }

        customTreeSet.forEach(st -> {
            System.out.println(st.getName());
        });

        System.out.println("-----------------------");

        customTreeSet.add(new Student(100));
        customTreeSet.add(new Student(90));
        customTreeSet.add(new Student(60));
        customTreeSet.add(new Student(99));

        System.out.println(customTreeSet);
        treeSet.clear();
        System.out.println(treeSet.size());

        System.out.println("-----------------------");

        Set<Student> customTreeSet2 = new TreeSet(new Comparator<Student>() {

            @Override
            public int compare(Student o1, Student o2) {
                return o2.getScore() - o1.getScore();
            }
        });

        customTreeSet2.add(new Student(100, "a", 1));
        customTreeSet2.add(new Student(90, "b", 2));
        customTreeSet2.add(new Student(60, "c", 3));

        System.out.println("完整：" + customTreeSet2);

        customTreeSet2.removeIf(st -> "a".equals(st.getName()));
        System.out.println("已刪除'a'：" + customTreeSet2);
    }
}

class Student {

    private int score;
    private String name;
    private int age;

    public Student(int score, String name, int age) {
        this.score = score;
        this.name = name;
        this.age = age;
    }

    public Student(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "score=" + score +
                '}';
    }

    public Student() {
        super();
    }

    @Override
    public int hashCode() {
        System.out.println("...hashcode()");
        return 1;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println(this.name + "...equals()");
        Student student = (Student) obj;
        return this.name.equals(student.name) && this.age == student.age;
    }
}

