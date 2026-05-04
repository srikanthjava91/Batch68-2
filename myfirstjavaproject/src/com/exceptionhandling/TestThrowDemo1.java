package com.exceptionhandling;

import java.util.Scanner;

public class TestThrowDemo1 {

	public static void main(String[] args) {

		System.out.println("main method strated ");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number1 : ");
		int a = sc.nextInt();

		System.out.println("Enter a number2: ");
		int b = sc.nextInt();

		if (b != 0) {
			System.out.println(a / b);
		} else {
			throw new ArithmeticException("Babu chitti dont send zeros !!");
		}

	}

}
