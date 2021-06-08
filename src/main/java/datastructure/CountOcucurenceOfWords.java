package datastructure;

import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class CountOcucurenceOfWords {

	public static void main(String[] args) {
		String text = "I love java programing because java programming is interesting";
		Map<String, Integer> map = new TreeMap<>(new Descending());

		String[] words = text.split(" ");

		for (int i = 0; i < words.length; i++) {
			String key = words[i].toLowerCase();

			if (key.length() > 0) {
				if (!map.containsKey(key)) { // containsKey() 方法检查 hashMap 中是否存在指定的 key 对应的映射关系。
					map.put(key, 1);
				} else {
					int value = map.get(key); // get 取得指定key位置
					value += 1;
					map.put(key, value); // put 不是從後面插入，而是指定key位置直接覆蓋
				}
			}
		}

		System.out.println(map);
//		map.forEach((k, v) -> {
//			System.out.println(k + " : " + v);
//		});
	}

	// 降序排列
	public static class Descending implements Comparator<String> {

		@Override
		public int compare(String o1, String o2) {
			return o1.compareTo(o2);
		}
	}
}

// 降序排列
// class Descending implements Comparator<String> {
//
//	@Override
//	public int compare(String o1, String o2) {
//		return o1.compareTo(o2);
//	}
//}



