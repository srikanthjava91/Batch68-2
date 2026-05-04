package com.Stringhandling;

public class TestStrDemo12 {

	public static void main(String[] args) {
		System.out.println("main method started !!");

		String str1 = "Java";// SCP
		String str2 = new String("Java");// String with new --> Heap

		System.out.println(str1 == str2);
		str2 = str2.intern();
		System.out.println(str1 == str2);

		System.out.println("main method ended !!");
	}

}
