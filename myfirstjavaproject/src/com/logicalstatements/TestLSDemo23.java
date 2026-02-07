package com.logicalstatements;

import java.util.Scanner;

//Q) WAP to find the given number is Armstrong or not ..?
public class TestLSDemo23 {

	public static void main(String[] args) {
		System.out.println("main method started !!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();// 371

		String digits = Integer.toString(n);
		int digitCount = digits.length();

		int r = 0;
		int sumP = 0;
		int temp = n;

//		int digitCount = 0;
//		while (n != 0) {
//			n = n / 10;
//			digitCount++;
//		}

		int n1 = temp;
		while (n1 != 0) {
			r = n1 % 10;// 371%10 --> 1
			n1 = n1 / 10; // 371/10 --> 37
			sumP = (int) (sumP + Math.pow(r, digitCount));
		}

		if (temp == sumP) {
			System.out.println("The Given number is ArmStrong number : ");
		} else {
			System.out.println("The Given number is not an ArmStrong number : ");
		}

	}

}
