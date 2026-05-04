package com.collectionsframeworks.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestMobile {

	public static void main(String[] args) {

		List<Integer> l = new ArrayList<>();
		l.add(100);
		l.add(50);
		l.add(150);

		Collections.sort(l);
		System.out.println(l);
		
		System.out.println("*********************");

		Mobile m1 = new Mobile("9R", "One Plus", 40000.00, "Blue");
		Mobile m2 = new Mobile("16 Pro", "Iphone", 140000.00, "White");
		Mobile m3 = new Mobile("V-20", "Vivo", 20000.00, "Black");
		Mobile m4 = new Mobile("NIO-10", "IQ", 40000.00, "Gray");
		Mobile m5 = new Mobile("N-1", "Nokia", 15000.00, "Black");

		List<Mobile> ll = new ArrayList<>();
		ll.add(m1);
		ll.add(m2);
		ll.add(m3);
		ll.add(m4);
		ll.add(m5);
		
//		The method sort(List<T>) in the type Collections is not applicable for the arguments (List<Mobile>)
		Collections.sort(ll);

		for (Mobile m : ll) {
			System.out.println(m);
		}

	}

}
