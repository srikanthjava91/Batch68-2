package com.collectionsframeworks;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class TestCollectionDemo13 {

	public static void main(String[] args) {

		System.out.println("main method started ");
		List<String> names = new ArrayList<>();

		names.add("Abhishek");
		names.add("K L Rahul");
		names.add("Tilak");
		names.add("Vabhav Soorya");
		names.add("SKY");

//		Iterator<String> itr = names.iterator();

		ListIterator<String> itr = names.listIterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("*******************************");

		while (itr.hasPrevious()) {
			System.out.println(itr.previous());
		}

		System.out.println("main method ended ");

	}
}
