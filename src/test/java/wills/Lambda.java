package wills;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda {

	public static void main(String[] args) {
		final int MAX = 10;
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i <= MAX; i++) {
			list.add(i+1);
		}
		System.out.println(list);

		for(int i = 0 ;i< list.size();i++){
			int item = list.get(i);
		}

//		list.indexOf("a");

		List<Integer> list2  = list.stream().filter(D -> {
			return D > 3;
		}).collect(Collectors.toList());
		System.out.println(list2);

	}
}
