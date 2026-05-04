package com.collectionsframeworks;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class TestCollectionDemo18 {

	public static void main(String[] args) {
		List<Integer> al = new CopyOnWriteArrayList<>();

		al.add(10);
		al.add(20);
		al.add(40);
		al.add(30);
		al.add(50);
		al.add(60);

//		for (int i = 0; i < al.size(); i++) {
//			System.out.println(al.get(i));
//			al.add(100);
//		}

		for (int a : al) {
			System.out.println(a);
//			al.add(100);
		}

//		Iterator<Integer> itr = al.iterator();
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//			al.add(100);
//		}

		System.out.println(al);
	}

}
