package com.exceptionhandling;

import java.util.Scanner;

//UnChecked Exceptions 01 --> ArithematicException 
public class TestExDemo1 {

	public static void main(String[] args) {
		System.out.println("main method strated !!");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number : ");
		int a = sc.nextInt();

		System.out.println("Enter b number : ");
		int b = sc.nextInt();

		try {
			System.out.println("in try ");
			System.out.println(a / b);
			// No exception of type Object can be thrown;
//			an exception type must be a subclass of Throwable
		} catch (Exception e) {
			System.out.println("in catch ");
			e.printStackTrace();
		}

		System.out.println("main method ended !!");
		System.out.println("main method ended !!");
		System.out.println("main method ended !!");
		System.out.println("main method ended !!");
		System.out.println("main method ended !!");
		System.out.println("main method ended !!");

	}

}
