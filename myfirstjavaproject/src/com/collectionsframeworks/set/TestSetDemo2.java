package com.collectionsframeworks.set;

import java.util.HashSet;
import java.util.Set;

public class TestSetDemo2 {

	public static void main(String[] args) {

		Set<String> s1 = new HashSet<>();// 16 --> 0.75

		s1.add("Ab");//31* 0 + 65 + 31*65+  98 
		s1.add("Cat");
		s1.add("pa");
		s1.add("java");
		s1.add("vcube");

		System.out.println(s1);

	}

}
