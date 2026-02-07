package com.logicalstatements;

import java.util.Scanner;

public class TestLSDemo22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();

		int temp = n;
		int sumP = 0;
		int r = 0;

		// 153 !=0
		while (n != 0) {
			r = n % 10;// 153%10 --> 3, 15%10 --> 5, 1%10 --> 1
			n = n / 10;// 153/10 --> 15, 15/10 --> 1, 1/10 --> 0
			sumP = sumP + r * r * r;// 0+ 27+ 125 + 1 = 153
		}

		if (temp == sumP) {
			System.out.println("The Given number is ArmStrong number : ");
		} else {
			System.out.println("The Given number is not an ArmStrong number : ");
		}

	}

}
