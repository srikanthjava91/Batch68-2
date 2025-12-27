package com.logicalstatements;

import java.util.Scanner;

public class TestLSDemo7 {

	public static void main(String[] args) {

		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a week name : ");

		String day = sc.next();

		switch (day) {
		case "Monday" -> {
			System.out.println("All mondays Lazy days");
			System.out.println("But I love to go Vcube classes ");
		}
		case "Tuesday", "Wednesday", "Thursday" -> {
			System.out.println("Rotinue days ");
		}

		case "Friday " -> System.out.println("Weekend mode on ");
	
		case "saturday", "sunday" -> System.out.println("Happy weekend & fun day !!");
		
		default -> System.out.println("The entered week is not available !!");

		}

		sc.close();
	}

}
