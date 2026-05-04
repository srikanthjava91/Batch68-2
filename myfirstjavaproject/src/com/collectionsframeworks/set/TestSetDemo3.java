package com.collectionsframeworks.set;

import java.util.SortedSet;
import java.util.TreeSet;

public class TestSetDemo3 {

	public static void main(String[] args) {

		SortedSet<Object> ss1 = new TreeSet<>();
		ss1.add(3);
		ss1.add("A");
		ss1.add("C");
		ss1.add("B");
		ss1.add(10);
		ss1.add(5);
		System.out.println(ss1);

		SortedSet<Integer> ss = new TreeSet<>();
		ss.add(10);
		ss.add(8);
		ss.add(7);
		ss.add(5);
		ss.add(6);
		ss.add(20);
		ss.add(30);

		System.out.println(ss.first());
		System.out.println(ss.last());

		// are strictly less than toElement
		System.out.println(ss.headSet(7));// [5,6]

		// elements are greater than or equal to fromElement.
		System.out.println(ss.tailSet(8));// [8 10 20 30]

		System.out.println(ss.subSet(7, 20));// [7 8 10]

		System.out.println(ss);
		System.out.println(ss.reversed());

	}

}
