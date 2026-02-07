package com.logicalstatements;

import java.util.Scanner;

public class TestLSDemo26 {

	public static void main(String[] args) {
		System.out.println("main method started !!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number : ");
		int a = sc.nextInt();

		System.out.println("Enter Second number : ");
		int b = sc.nextInt();

		int count = 0;
		int carry = 0;

		while (a != 0 || b != 0) {
			int r1 = a % 10;
			int r2 = b % 10;

			if ((r1 + r2) + carry >= 10) {
				count++;
				carry = 1;
			}

			a = a / 10;
			b = b / 10;
		}

		System.out.println("Carry is: " + count);

	}
}
