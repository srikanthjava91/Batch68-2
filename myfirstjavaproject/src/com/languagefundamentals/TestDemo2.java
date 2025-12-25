package com.languagefundamentals;

import static java.lang.System.out;

public class TestDemo2 {

	static String name = "Srikanth";

	public static void main(String[] args) {
		
		System.out.println(TestDemo2.name.length());//8

		char[] ch = { 'A', 'P', 'P' };
		System.out.println(ch);

		TestDemo2 t = new TestDemo2();
		System.out.println(t);// Address of the object

		out.println("main mathod started ");// String
		out.println();// no arg
		out.println(100 + " " + 5.6);// int
		out.println(100L);// long

		out.println(5.6F);// float
		out.println(5.6D);// double

		out.println('A');// char
		out.println(false);// boolean

	}
}
