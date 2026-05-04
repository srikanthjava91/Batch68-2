package com.collectionsframeworks.map;

import java.util.Hashtable;
import java.util.Map;

//HashMap allows one null key and any number null vlaues and it contains non synchronized methods.
//Hashtable will not allow null key or null values, 
//if you added by mistake you will get NullPointerException.
public class TestMapDemo8 {

	public static void main(String[] args) {

		Map<String, String> map = new Hashtable<>();

		map.put("a", "App");
		map.put("b", "Bootstrap");
		map.put("c", "CSS");
		map.put("d", "DSA");
		map.put("e", "Eclipse");
		map.put("z", "Zip");

		map.put(null, "Srikanth");
		map.put(null, "Charan");
		map.put("x", null);
		map.put("y", null);

		System.out.println(map);

	}

}
