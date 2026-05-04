package com.Stringhandling;

public class TestStrDemo4 {

	public static void main(String[] args) {

		System.out.println("main method strated");

		TestStrDemo4 t1 = new TestStrDemo4();
		System.out.println(t1);// Address of the Object
		System.out.println(t1.toString());

		String s1 = new String();
		System.out.println(s1); //

		String s2 = new String("Java");
		System.out.println(s2);// Java

		System.out.println("main method ended");
	}

}
