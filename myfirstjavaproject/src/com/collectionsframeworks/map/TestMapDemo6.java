package com.collectionsframeworks.map;

import java.util.Map;
import java.util.WeakHashMap;

//HashMap vs WeakHashMap 
//HashMap Dominates Garbage Collector, 
//where as Garbage collector dominates WeakHashmap 
class Student {

	@Override
	public String toString() {
		return "student";
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize method called ");
	}

}

public class TestMapDemo6 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("main metd started ");

		Map<Object, String> map = new WeakHashMap<>();
		Student st = new Student();
		map.put(st, "Java");
		System.out.println(map);

		st = null;
		System.gc();
		Thread.sleep(2000);
		System.out.println(map);

	}
}
