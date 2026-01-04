package com.logicalstatements;

import java.util.Scanner;

//WAP to print factorial of a given number using for loop ..? 
//input : 5 
//output : 5* 4* 3* 2*1 = 120
public class TestLSDemo16 {

	public static void main(String[] args) {
		System.out.println("main method started !!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		long n = sc.nextLong();
		long fact = 1;

		for (long i = n; i > 0; i--) {
			fact = fact * i;
		}

		System.out.println("Factorial of given number is : " + fact);

	}
}
