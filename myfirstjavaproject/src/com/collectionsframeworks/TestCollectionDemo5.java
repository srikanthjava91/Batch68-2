package com.collectionsframeworks;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollectionDemo5 {

	public static void main(String[] args) {
		System.out.println("main method started !");

		Collection<String> cricketerNames = new ArrayList<>();
		cricketerNames.add("Ishan");
		cricketerNames.add("Sanju");

		if (cricketerNames.isEmpty()) {
			cricketerNames.add("Abhishek");
			cricketerNames.add("Surya");
		}
		System.out.println(cricketerNames);
	}
}
