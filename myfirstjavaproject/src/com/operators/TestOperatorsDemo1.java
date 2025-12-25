package com.operators;

import java.util.Scanner;

//1) Arithmetic Operators : + - * / % 
public class TestOperatorsDemo1 {

	public static void main(String[] args) {
		System.out.println("main method strated !!");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number : ");
		int a = sc.nextInt();// 98
		System.out.println("Enter b number : ");
		int b = sc.nextInt();// 5
//		BODMAS 
		System.out.println("Addition of two numbers  " + (a + b));// 100200
		// The operator - is undefined for the argument type(s) String, int
//		System.out.println("Subtraction of two numbers  "+ b-a);//
		System.out.println("Subtraction of two numbers  " + (b - a));//

		System.out.println("Multiplication of two numbers  " + a * b);

//		Division will give Quotient 
		System.out.println("Division of two numbers  " + a / b);// 98/5 = 19

//		Modulus will give Reminder 
		System.out.println("Modulus of two numbers  " + a % b);// 98%5 = 3
	}
}
