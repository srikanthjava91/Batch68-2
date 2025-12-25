package com.operators;

public class TestOperatorsDemo3 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		int a = 5;
		int b = 6;

		// a++ --> a= a+1
		// ++a --> a = a+1
		System.out.println(a++);// 5 --> 6
		System.out.println(++a);// 7
		System.out.println(++a);// 8
		System.out.println(b++);// 6 --> 7
		System.out.println(++b);// 8
		System.out.println(b++);// 8 --> 9
		System.out.println(a--);// 8 --> 7
		System.out.println(a--);// 7 --> 6
		System.out.println(--a);// 5
		System.out.println(--a);// 4
		System.out.println(b--);// 9 --> 8
//
//		System.out.println(a + b);
		System.out.println("A value : " + a);// 4
		System.out.println("B value : " + b);// 8
	}
}
