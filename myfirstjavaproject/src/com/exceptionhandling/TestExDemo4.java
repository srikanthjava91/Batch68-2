package com.exceptionhandling;

public class TestExDemo4 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		String s1 = "Srikanth";// String is also working based indexes from 0
		System.out.println(s1.charAt(4));// a

		try {
			System.out.println("in try !");
			String s2 = "Java";
			System.out.println(s2.charAt(4));// StringIndexOutOfBoundException
		} catch (StringIndexOutOfBoundsException ae) {
			System.err.println("in catch !!");
			System.err.println(ae.getMessage());
		}

		System.out.println("Hello Guys, Good evening !!");
		System.out.println("Hello Guys, Good evening !!");
		System.out.println("Hello Guys, Good evening !!");
		System.out.println("Welcome to Exception handlong !!");

	}

}
