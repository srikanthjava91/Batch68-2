package com.languagefundamentals.methods;

import java.util.Scanner;

//Q) WAP to print the number is perfect or not ..? 
//perfect number : sum of its factor excluding the given number 
public class TestMethodsDemo11 {

	boolean isPerfect(int n) {
		boolean status = false;
		int sum = 0;

		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				System.out.print(i + " ");
				sum = sum + i;
			}
		}
		System.out.println("sum : " + sum);
		if (sum == n) {
			status = true;
		}

		return status;
	}

	void main(String[] args) {
		System.out.println("main method strated ");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int n = sc.nextInt();

		boolean flag = isPerfect(n);

		if (flag) {
			System.out.println("The given number is Perfect ");
		} else {
			System.out.println("The given number is not Perfect ");
		}

		System.out.println("main method ended ");
	}

}
