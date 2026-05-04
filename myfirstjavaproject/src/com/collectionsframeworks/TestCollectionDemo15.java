package com.collectionsframeworks;

import java.util.LinkedList;
import java.util.List;

//CRUD operation 
public class TestCollectionDemo15 {

	public static void main(String[] args) {

		List<Integer> list = new LinkedList<>();

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(5, 70);

		list.addFirst(70);
		list.addLast(100);

		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		System.out.println(list);

	}

}
