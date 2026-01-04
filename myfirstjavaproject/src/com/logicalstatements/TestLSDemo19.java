package com.logicalstatements;

import java.util.Scanner;

//Q) WAP to print first 100 prime numbers..?
public class TestLSDemo19 {

	static boolean checkPrime(int n) {
		boolean status = true;

		if (n == 0 || n == 1) {
			return false;
		}

		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				status = false;
				break;
			}
		}

		return status;
	}

	public static void main(String[] args) {
		System.out.println("main method started !");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a  number : ");
		int n = sc.nextInt();

		for (int i = 0; i <= n; i++) {
			if (checkPrime(i)) {
				System.out.print(i + " ");
			}

		}

	}

}
