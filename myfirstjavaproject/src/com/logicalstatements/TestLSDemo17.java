package com.logicalstatements;

import java.util.Scanner;

//Q) WAP to print factorial of given number using recursion ..?
public class TestLSDemo17 {

	long findFact(long n) {

		if (n == 0 || n == 1) {
			return 1;
		}

		// 5 * findFact(4) --> 24 --> 120
		// 4 * findFact(3) --> 6
		// 3 * findFact(2) --> 2
		// 2 * findFact(1) --> 1
		return n * findFact(n - 1);
	}

	void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		long n = sc.nextLong();

		long fact = findFact(n);
		System.out.println("Factorial of a given number: " + fact);

	}
}
