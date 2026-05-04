package com.collectionsframeworks;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class TestCollectionDemo16 {

	public static void main(String[] args) {

		Vector<Integer> v = new Vector<>();

		v.addElement(10);
		v.addElement(30);
		v.addElement(40);
		v.addElement(50);
		v.addElement(50);
		v.addElement(20);
		v.addElement(60);
		v.addElement(null);
		v.addElement(null);
		v.addElement(null);

		Enumeration<Integer> en = v.elements();
		while (en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}

		System.out.println("*********************");

		List<Integer> v1 = new Vector<>();
		v1.add(10);
		v1.add(20);
		v1.add(30);

		Iterator<Integer> itr = v1.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println(v);

	}

}
