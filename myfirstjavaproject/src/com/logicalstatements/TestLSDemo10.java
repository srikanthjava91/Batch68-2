package com.logicalstatements;

import java.util.Scanner;

public class TestLSDemo10 {

	public static void main(String[] args) {
		System.out.println("main method strated !");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int n = sc.nextInt();
		System.out.println(getDay(n));
		sc.close();
	}

	static String getDay(int n) {

		return switch (n) {
			case 1 -> "Sunday";
			case 2 -> "Monday";
			case 3 -> "Tuesday";
			case 4 -> "Wednesday";
			case 5 -> "Thursday";
			case 6 -> "Friday";
			case 7 -> "Saturday";
			default -> "invalid entry";
		};

	}
}
