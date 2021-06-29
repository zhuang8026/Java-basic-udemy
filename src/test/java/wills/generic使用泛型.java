package wills;

import java.util.ArrayList;

public class generic使用泛型<E> {


	public static void main(String[] args) {
		generic自定義泛型<String> list = new generic自定義泛型<String>();
		list.getSize();
		list.pop();
		list.peek();
		list.push("william");
	}
}
