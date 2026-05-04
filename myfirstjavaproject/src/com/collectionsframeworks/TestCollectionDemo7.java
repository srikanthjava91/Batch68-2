package com.collectionsframeworks;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestCollectionDemo7 {

	public static void main(String[] args) {

		Collection<Integer> numbers = new ArrayList<>();

		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(30);
		numbers.add(40);
		numbers.add(50);
		numbers.add(60);
		numbers.add(60);
		numbers.add(60);

//		for (Integer i : numbers) {
//			System.out.print(i + " ");
//		}

		Iterator<Integer> it1 = numbers.iterator();
		while (it1.hasNext()) {
//			System.out.print(it1.next() + " ");
			if (it1.next() == 30) {
				it1.remove();
			}
		}

		numbers.remove(50);
		System.out.println(numbers);

	}
}
