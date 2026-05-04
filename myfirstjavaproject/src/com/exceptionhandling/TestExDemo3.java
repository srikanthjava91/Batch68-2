package com.exceptionhandling;

public class TestExDemo3 {

	public static void main(String[] args) {

		System.out.println("main method strated !!");

		String s = "Srikanth";
		System.out.println(s.length());// 8

		String s1 = "null";
		System.out.println(s1.length());// 4

		try {
			String s2 = null;
			System.out.println(s2.length());// NPE--> null dot any operation is called NPE
		} catch (NullPointerException ne) {
			System.err.println("in catch ");
			System.err.println(ne.getMessage());
		}

		System.out.println("main method ended !!");

	}

}
