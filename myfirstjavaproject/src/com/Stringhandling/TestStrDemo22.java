package com.Stringhandling;

public class TestStrDemo22 {

	public static void main(String[] args) {
		System.out.println("main method started !!");
		String s1 = "Srikanth";
		System.out.println(s1);
		
//		StringBuffer sb = "Srikanth";//CE:Type mismatch: cannot convert from String to StringBuffer
//		System.out.println(sb);
		
		StringBuffer sb1 = new StringBuffer("Hello");
		System.out.println(sb1);//
		
		String s2 = new String("Java");
		System.out.println(s2);

		String s = new String();
		System.out.println(s);

		System.out.println("main method ended !!");
	}

}
