package wills;

import java.util.ArrayList;

public class generic自定義泛型<E> {
	public ArrayList<E> list = new ArrayList<E>();

	// 取得數組全部的數量
	public int getSize(){
		return list.size();
	}

	// 返回佔領的元素，但不刪除 (last one)
	public E peek(){
		return list.get(list.size() - 1);
	}

	// 返回佔領的元素，並刪除 (last one)
	public E pop(){
		E obj = list.get(list.size() - 1);
		list.remove(obj);
		return obj;
	}

	// 從後面塞入參數
	public void push(E data){
		list.add(data);
	}


}
