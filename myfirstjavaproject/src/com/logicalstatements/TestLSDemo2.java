package com.logicalstatements;

import java.util.Scanner;

public class TestLSDemo2 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);

		System.out.println("Are you attending the classes 90%..? ");
		boolean areYouAttendingtheClassesDaily = sc.nextBoolean();

		System.out.println("Are you completing assignments daily ..? ");
		boolean areYouCompletingAssignments = sc.nextBoolean();

		System.out.println("Are you attending the Weekly Exams ..?");
		boolean areYouAttendingExamsWeekly = sc.nextBoolean();

		System.out.println("Are you attending the Mock interviews every week ..? ");
		boolean areYouAttendingTheMocks = sc.nextBoolean();

		if (areYouAttendingtheClassesDaily == true && areYouCompletingAssignments && areYouAttendingExamsWeekly
				&& areYouAttendingTheMocks) {
			System.out.println("You wil get a job in 6 months ");
		} else {
			System.out.println("Pray the god daily !!!");
		}

	}
}
