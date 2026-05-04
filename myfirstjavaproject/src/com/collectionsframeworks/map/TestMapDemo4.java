package com.collectionsframeworks.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class TestMapDemo4 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		Map<Integer, String> map = new LinkedHashMap<>();
		map.put(5, "Pawan");
		map.put(6, "Umesh");
		map.put(1, "Nithish");
		map.put(2, "Suresh");
		map.put(3, "Vijay");
		map.put(4, "Bharath");

		System.out.println(map);

	}

}
