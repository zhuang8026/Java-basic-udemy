package datastructure.map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        Map<Integer, String> treeMap = new TreeMap(new JiangxuSorter());
        treeMap.put(40000, "小张");
        treeMap.put(30000, "小李");
        treeMap.put(50000, "小赵");
        treeMap.put(10000, "小旺");
        System.out.println("treeMap: " + treeMap); //{50000=小赵, 40000=小张, 30000=小李, 10000=小旺}
//        treeMap.forEach((k, v) -> {
//            System.out.println(k + ":" + v);
//        });

//        Map<Integer, String> hashMap = new HashMap<Integer, String>(); // 無順序
//        hashMap.put(40000, "小张");
//        hashMap.put(30000, "小李");
//        hashMap.put(50000, "小赵");
//        hashMap.put(10000, "小旺");
//        System.out.println("hashMap: " + hashMap); // {40000=小张, 30000=小李, 50000=小赵, 10000=小旺}

        Student student1 = new Student();
	    student1.setName("小旺一號");
	    student1.setScore(100);

        Student student2 = new Student();
	    student2.setName("小旺二號");
        student2.setScore(99);

        Student student3 = new Student();
	    student3.setName("小旺三號");
        student3.setScore(89);

        Map<Student, String> studentStringMap = new TreeMap<>(new StudentScoreJiangxu()); // new TreeMap<>(comparator);

        studentStringMap.put(student1, "好学生");
        studentStringMap.put(student2, "中好学生");
        studentStringMap.put(student3, "一般学生");

        studentStringMap.forEach((k, v) -> {
            System.out.println(k + ":" + v);
        });


    }
}

// 降序排列
class JiangxuSorter implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }
}

// 自定義類 - 降序排列
class StudentScoreJiangxu implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getScore() - o2.getScore();
    }
}

class Student {
    private String name;
    private int score;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}

