package com.collectionsframeworks;

import java.util.ArrayList;
import java.util.List;

public class TestCollectionDemo14 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);

		System.out.println(list);
		List<Integer> sList = list.subList(0, 3);
		System.out.println(sList);// 10 20 30
		sList.remove(0);
		System.out.println(list);// 10 20 30 40 50 60
	}
}
