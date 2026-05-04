package com.collectionsframeworks;

import java.util.ArrayList;
import java.util.List;

public class TestCollectionDemo9 {

	public static void main(String[] args) {

//		Constructs an empty list with an initial capacity of ten.
//		ArrayList internally using one Data Structure name called Re-Sizable Array.
//		Whenever we added additional value the capacity will increase like below.
//		Current Capacity * 3/2;
		List<Integer> al2 = new ArrayList<>(30);// 0
		al2.add(15);
		al2.add(16);
		al2.add(17);
		al2.add(18);
		al2.add(null);
		al2.add(null);
		al2.add(null);

		System.out.println(al2);

		List<Integer> al1 = new ArrayList<>();// 0
		System.out.println("size: " + al1.size());
		al1.add(0, 200);
		al1.add(1, 10);// IndexOutOfBoubdsException
		al1.add(18);
		al1.add(45);
		al1.add(7);
		al1.add(8);
		al1.add(1);
		System.out.println(al1);// 18 10 45 7 8 1

		List<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(60);

		al.add(1, 15);
		al.add(4, 35);
		System.out.println(al);// 10 15 20 30 35 40 60

	}

}
