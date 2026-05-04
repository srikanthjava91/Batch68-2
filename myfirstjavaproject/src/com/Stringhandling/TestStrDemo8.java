package com.Stringhandling;

public class TestStrDemo8 {

	public static void main(String[] args) {
		System.out.println("main method strated !!");

		String str1 = "India";
		String str2 = "India";

		System.out.println(str1.contentEquals(str2));

		char ch[] = { 'a', 'p', 'p' };
		System.out.println(ch);// app
		
		String str3 = String.copyValueOf(ch);
		
		

	}

}
