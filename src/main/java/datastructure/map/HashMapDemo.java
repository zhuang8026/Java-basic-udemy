package datastructure.map;

import datastructure.CountOcucurenceOfWords.Descending;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		//小明 -> 20000  key/value
		Map<String, Integer> incomeMap = new HashMap<>();
		incomeMap.put("小明", 20000);
		incomeMap.put("小王", 30000); // 新增
		incomeMap.put("小王", 40000); // 修改 -> key 值對應即可修改

		System.out.println(incomeMap);
		System.out.println(incomeMap.get("小明"));
		System.out.println(incomeMap.get("小王"));

		System.out.println("++++++++++++++++++++++++++++++++++");

		for (Map.Entry<String, Integer> entry : incomeMap.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}

		Set<Map.Entry<String, Integer>> entrySet = incomeMap.entrySet();
		for (Map.Entry<String, Integer> entry : entrySet) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}

		System.out.println("+++++++++++++++ lambda way +++++++++++++++");
		//lambda expression
		incomeMap.forEach((k, v) -> {
			System.out.println(k + ":" + v);
		});
//		incomeMap.entrySet().stream().filter(D -> {
//			return !D.getKey().equals("小明");
//		});

		System.out.println("+++++++++++++++ Iterator +++++++++++++++");

		Set set = incomeMap.entrySet();
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) { // hasNext 是否還有值可以遍歷
			Map.Entry entry = (Map.Entry) iterator.next();
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}

		incomeMap.put("小明", 25000); // 修改元素
		System.out.println(incomeMap);

		incomeMap.remove("小明"); // 刪除元素
		System.out.println(incomeMap);
		incomeMap.remove("小王", 30000); // 指定刪除元素
		System.out.println(incomeMap);

		Descending descending = new Descending();
	}
}
