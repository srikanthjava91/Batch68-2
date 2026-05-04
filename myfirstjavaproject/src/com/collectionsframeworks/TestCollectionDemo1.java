package com.collectionsframeworks;

import java.util.Collection;
import java.util.ArrayList;

public class TestCollectionDemo1 {

	public static void main(String[] args) {

//		Collection is a raw type. 
//		References to generic type Collection<E> should be parameterized
		Collection<Integer> c = new ArrayList<>();

		c.add(100);
		c.add(200);
		c.add(300);

		System.out.println(c);
		System.out.println(c.hashCode());
		System.out.println(System.identityHashCode(c));
	}

}
