package com.collectionsframeworks.map;

import java.util.IdentityHashMap;
import java.util.Map;

//HashMap internally checks the .equals() method to check the keys to compare, 
//where .equals() method checks only the content but not addresses.

//IdentityHashMap internally Checks == Operator to check the keys to compare, 
//where == operator checks only the address of the object.

//Note : when we use new String() it creates every time a new Object.
//		 when we use String Literals it create every time the same address it not creates new object.

public class TestMapDemo5 {

	public static void main(String[] args) {

//		Map<String, String> m = new HashMap<>();
//		String s1 = "Pawan";
//		String s2 = "Pawan";
//		m.put(s1, "Java");
//		m.put(s2, "Python");
//		System.out.println(m);

//		Map<String, String> m = new HashMap<>();
//		String s1 = new String("Srikanth");
//		String s2 = new String("Srikanth");
//		m.put(s1, "Java");
//		m.put(s2, "Python");
//		System.out.println(m);
		
//		Map<String, String> m = new IdentityHashMap<>();
//		String s1 = new String("Srikanth");//101
//		String s2 = new String("Srikanth");//102
//		m.put(s1, "Java");
//		m.put(s2, "Python");
//		System.out.println(m);
		
		Map<String, String> m = new IdentityHashMap<>();
		String s1 = "Aslesha";//101
		String s2 = "Aslesha";//101
		
		m.put(s2, "Python");
		m.put(s1, "Java");
		
		System.out.println(m);
		
		

	}

}
