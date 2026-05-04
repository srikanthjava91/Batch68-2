package com.collectionsframeworks;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollectionDemo4 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		
		Collection<String> s1 = new ArrayList<>();// []
		s1.add("A");
		System.out.println(s1.hashCode());
		
		
		Collection<String> s2 = new ArrayList<>();// []
		s2.add(null);
		System.out.println(s2.hashCode());
		

		Collection<Integer> c1 = new ArrayList<>();// []
		c1.add(20);
		c1.add(20);
		System.out.println(c1.hashCode());

		Collection<Integer> c2 = new ArrayList<>();// []
		c2.add(20);
		c2.add(20);
		c2.add(20);
		System.out.println(c2.hashCode());
		

		System.out.println(c1.equals(c2));

	}

}
