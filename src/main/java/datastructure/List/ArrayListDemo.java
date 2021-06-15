package datastructure.List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<String> arrayList = new ArrayList();
		arrayList.add("b");  // 新增
		arrayList.add("a");
		arrayList.add("c");
		arrayList.add(0, "a1"); // 新增 ，指定數組下標

		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}

		System.out.println(arrayList.get(0));
		arrayList.set(1, "bbbbbbb");
		System.out.println(arrayList);

		arrayList.remove(0); // 指定刪除元素

		System.out.println(arrayList);

		arrayList.remove("c");  // 指定刪除元素
		System.out.println(arrayList);

		arrayList.clear(); // 數組清空

		System.out.println(arrayList);

		showGreaterThan100();

	}


	private static void showGreaterThan100() {
		List<Integer> integerList = new ArrayList<>();
		integerList.add(101);
		integerList.add(55);
		integerList.add(2000);
		integerList.add(1);
		integerList.add(300);

//        for (int i = 0; i < integerList.size(); i++) {
//            boolean bool = integerList.get(i) < 100;
//            if (bool) {
//                integerList.remove(i);
//            }
//        }
//		System.out.println(integerList);

		// JDK1.8 start Lambda
		// list 本身沒有 Lambda 函數，所以要先使用 stream() 轉成物件流才能使用 filter、forEach ....
		// 轉成 stream 之後，最後要使用 collect 集合起來並將
		// Stream stream = integerList.stream().filter(item -> item > 100);
		List<Integer> c1 = integerList.stream().filter(item -> item > 100)//
				.map(item -> item + 10)//
				.sorted()//
				.collect(Collectors.toList());
		System.out.println(c1); // [111, 310, 2010]


	}


}
