package com.collectionsframeworks.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//When we add duplicate key, the old value is replacing with new value.
public class TestMapDemo2 {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();

		map.put(1, "Rahul");
		map.put(4, "Abhishek");
		map.put(7, "Dhoni");
		map.put(8, "Jadeja");
		map.put(18, "Kohli");
		map.put(9, "Srikanth");
		map.put(9, "Tilak varma");
		map.put(45, "Rohit");

		Set<Map.Entry<Integer, String>> entries = map.entrySet();
		for (Entry<Integer, String> entry : entries) {
			System.out.println(entry.getKey() + " ->" + entry.getValue());
		}

		System.out.println("************************");
//		the previous value associated with key, 
//		or null if there was no mapping for key.
		System.out.println(map.put(77, "Gill"));// null
		System.out.println(map.put(77, "Mahendra"));// Gill

		System.out.println(map);

		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.get(9));

	}

}
