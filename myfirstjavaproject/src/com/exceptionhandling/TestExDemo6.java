package com.exceptionhandling;

import java.util.Scanner;

class TestA {

	void method1() {
		System.out.println("method1 called from TestA ");
	}

}

class TestB extends TestA {

	void method1() {
		System.out.println("method1 called from TestB ");
	}

}

public class TestExDemo6 {

	public static void main(String[] args) {
		System.out.println("mian method started !!");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int age = sc.nextInt();

		if (age > 18) {
			System.out.println("You are eligible for Vote !!");
		} else {
			System.out.println("You are not eligible for Vote !!");
		}

		TestB t = new TestB();
		t.method1();

		TestA t1 = new TestB();
		t1.method1();

		try {
			TestB t2 = (TestB) new TestA();
//		t2.method1();
		} catch (ClassCastException cs) {
//			cs.printStackTrace();
			System.err.println(cs.getMessage());
		}

		System.out.println("mian method ended !!");
	}

}
