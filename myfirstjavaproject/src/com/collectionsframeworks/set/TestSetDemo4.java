package com.collectionsframeworks.set;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TestSetDemo4 {

	public static void main(String[] args) {

		NavigableSet<Integer> ss = new TreeSet<>();

		ss.add(100);
		ss.add(800);
		ss.add(700);
		ss.add(500);
		ss.add(200);
		ss.add(300);
		ss.add(1000);

		// Returns the greatest element in this set less than or equal to the given
		// element, or null if there is no such element.
		System.out.println(ss.floor(400));// 300

		// Returns the least element in this set greater than or equal to the given
		// element,
//		or null if there is no such element.
		System.out.println(ss.ceiling(900));// 1000

		// Returns the greatest element in this set strictly less than the given
		// element,
//		or null if there is no such element.
		System.out.println(ss.lower(300));// 200

		// Returns the least element in this set strictly greater than the given
		// element,
//		or null if there is no such element.
		System.out.println(ss.higher(800));// 1000

		System.out.println(ss.floor(100));

		System.out.println(ss);

	}

}
