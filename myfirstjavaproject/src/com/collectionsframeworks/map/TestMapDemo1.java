package com.collectionsframeworks.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestMapDemo1 {

	public static void main(String[] args) {

		Map<String, String> states = new HashMap<>();

		states.put("TG", "Talanagana");
		states.put("AP", "Andhrapradesh");
		states.put("TN", "Tamilnadu");
		states.put("KA", "Karnataka");
		states.put("KL", "Kerala");
		states.put("MH", "Maharashtra");
		states.put("DL", "Delhi");
		states.put("GJ", "Gujarat");
		states.put("RJ", "Rajasthan");
		states.put("UP", "Uttar Pradesh");
		states.put("MP", "Madhya Pradesh");
		states.put("WB", "West Bengal");
		states.put("OR", "Odisha");

		System.out.println(states);

		System.out.println(states.containsKey("MH"));// true
		System.out.println(states.containsValue("Odisha"));// true
		System.out.println(states.containsValue("Chennai"));// false

		System.out.println("************************************");

		Set<Entry<String, String>> entries = states.entrySet();
		for (Entry<String, String> entry : entries) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}

//		Map m = new HashMap();
//		m.put("A", "Apple");
//		m.put(1, 101);
//		m.put("In", "India");
//		m.put(91, "India");
//		System.out.println(m);

	}

}
