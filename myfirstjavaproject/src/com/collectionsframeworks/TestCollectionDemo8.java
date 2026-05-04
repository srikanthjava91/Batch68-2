package com.collectionsframeworks;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollectionDemo8 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		Collection<String> fruits = new ArrayList<>();
		fruits.add("Mango");
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Banana");
		fruits.add("Grapes");

		Collection<String> veggies = new ArrayList<>();
		veggies.add("Tomato");
		veggies.add("Potato");
		veggies.add("Oninon");
		veggies.add("Banana");
		veggies.add("Brinjal");

		fruits.retainAll(veggies);

		System.out.println(fruits);
		System.out.println(veggies);

		// length() vs length vs size()
		System.out.println(veggies.size());// 5

		// WAP to Convert From Collections to Array.
		Object[] vg = veggies.toArray();
		for (Object v : vg) {
			System.out.print(v + " ");
		}

	}

}
