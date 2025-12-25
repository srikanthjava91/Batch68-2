package com.operators;

import java.util.Scanner;

public class TestOperatorsDemo10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age : ");
		int age = sc.nextInt();
		String checkEligiility = (age > 18) ? "Yes" : "NO";
		System.out.println("Is Eligible for Driving ..? " + checkEligiility);
	}

}
