package com.collectionsframeworks.map;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

//HashMap vs ConcurrentHashMap 
public class TestMapDemo7 {

	public static void main(String[] args) {
		Map<String, String> map = new ConcurrentHashMap<>();

		map.put("a", "App");
		map.put("b", "Bootstrap");
		map.put("c", "CSS");
		map.put("d", "DSA");
		map.put("e", "Eclipse");
		map.put("z", "Zip");

		System.out.println(map);

		Set<Map.Entry<String, String>> entries = map.entrySet();
		for (Map.Entry<String, String> entry : entries) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
			map.put("J", "Java");
		}

	}

}
