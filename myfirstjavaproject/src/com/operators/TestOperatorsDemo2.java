package com.operators;

public class TestOperatorsDemo2 {

	public static void main(String[] args) {
		System.out.println("main method strated !!");

		int a = 10;
		int result = 0;

		result = result + a;
		result = result + 5;

//		Type mismatch: cannot convert from double to int
//		result = result + 4.5;
		result += 4.5;// 19

//		Type mismatch: cannot convert from double to int
//		result = result - 4.5;
		result -= 4.5;// 14

//		result = result * 3.5;
		result *= 3.5;// 49

//		result = result /3.5;
		result /= 3.5; // 14

//		result = result%2.5;
		result %= 2.5;// 14/2.5 = 1

		System.out.println("Result : " + result);// 19
		System.out.println("main method ended !!");
	}
}
