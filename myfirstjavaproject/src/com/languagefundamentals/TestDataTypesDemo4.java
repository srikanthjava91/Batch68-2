package com.languagefundamentals;

///Auto-Boxing & Auto-unBoxing features came in 1.5 version.
public class TestDataTypesDemo4 {

	public static void main(String[] args) {
		// primitive --> to Wrapper Object data types.
		// int to Integer --> Auto-Boxing
		Integer i3 = 100;
		// char to Character --> Auto-Boxing
		Character c1 = 'C';//

		// Wrapper Object data types --> can convert to primitive
		// Integer is converting to int --> Auto-Unboxing
		int i4 = i3;
		// Character is converting to char --> Auto-Unboxing
		char c2 = c1;

		String s1 = "123";
		int i1 = Integer.parseInt(s1);// Converting String to int

		String s2 = "7";
		int i2 = Integer.parseInt(s2);
		System.out.println(i1 + i2);// 1237--> 130

	}
}
