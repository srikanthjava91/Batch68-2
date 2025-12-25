package com.logicalstatements;

import java.util.Scanner;

public class TestLSDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a age : ");// 22
		int age = sc.nextInt();

		if (age > 18) {
			System.out.println("You are eligible for Voting ");
			System.out.println("Welcome to Vcube !");
		}

		if (age < 18) {
			System.out.println("arey babu !! niku inka time undi ra ");
			System.out.println("Good evening !!");
		}
		System.out.println("main method ended ");

	}

}
