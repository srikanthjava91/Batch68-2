package com.languagefundamentals;

public class TestDataTypesDemo6 {

	public static void main(String[] args) {

		Integer i1 = 10;// Primitive to Wrapper : Auto-Boxing 1.5 version
		Integer i2 = Integer.valueOf(10);// Internally Integer class using valueOf method.

		int i3 = i1;// Wrapper to Primitive : Auto-Unboxing
		int i4 = i2.intValue();// Internally From Integer class using xxxValue();

		// -128 to 127
		Integer i5 = 100;
		Integer i6 = 50;
		Integer i9 = 50;
		System.out.println(i5 == i6);// false
		System.out.println(i6 == i9);// true

		Integer i7 = 200;
		Integer i8 = 200;
		System.out.println(i7 == i8);// false
	}
}
