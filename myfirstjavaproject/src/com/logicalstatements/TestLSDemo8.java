package com.logicalstatements;

import java.util.Scanner;

//WAP to print calculation based on the Operator symbol.
public class TestLSDemo8 {

	public static void main(String[] args) {
		System.out.println("main method started !!");
		Scanner sc = new Scanner(System.in);
		
//		float f = 5.5F;
//		switch(f) {
//		case  5.5 : System.out.println("Hello");
//		
//		}
		
		
		
		System.out.println("Enter a number ");
		int a = sc.nextInt();

		System.out.println("Enter b number ");
		int b = sc.nextInt();

		System.out.println("Enter a symobl to proceed like + - * / %");
		char symb = sc.next().charAt(0);

		int result = 0;

		switch (symb) {

		case '+' -> result = a + b;
		case '-' -> result = a - b;
		case '*' -> result = a * b;
		case '/' -> result = a / b;
		case '%' -> result = a % b;
		default -> System.out.println("Invalid symbol to proceed !");
		}

		System.out.println("resulted value is : " + result);

	}

}
