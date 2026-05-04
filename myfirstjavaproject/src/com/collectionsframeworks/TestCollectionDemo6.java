package com.collectionsframeworks;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestCollectionDemo6 {

	public static void main(String[] args) {

		Collection<String> fruits = new ArrayList<>();

		fruits.add("Mango");
		fruits.add("Orange");
		fruits.add("Grapes");
		fruits.add("Water maelon");
		fruits.add("Banana");

		Iterator<String> itr = fruits.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

//		for (String fruit : fruits) {
//			System.out.println(fruit);
//		}

//		System.out.println(fruits);

	}

}
