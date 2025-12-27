package com.logicalstatements;

import java.util.Scanner;

//WAP to print Cricketer & details based on the Jersey no.
public class TestLSDemo5 {

	public static void main(String[] args) {
		System.out.println("main method started !!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Jersey number :");
		int jno = sc.nextInt();

//		switch (jno) {
//		case 7 -> System.out.println("MSD thala for a Reason ");
//		case 18 -> System.out.println("King Kohli ");
//		case 45 -> System.out.println("HITMAN Rohit Sharma ");
//		case 1 -> System.out.println("K L rahul ");
//		case 8 -> System.out.println("Ravindra Jadeja");
//		case 14 -> System.out.println("Abhishek sharma");
//		default -> System.out.println("unknown ");
//		}

		switch (jno) {
		case 7:
			System.out.println("MSD thala for a Reason ");
			System.out.println("Mahendra SIngh dhoni ");
			break;
		case 18:
			System.out.println("King Kohli ");
			break;
		case 45:
			System.out.println("HITMAN Rohit Sharma ");
			break;
		case 1:
			System.out.println("K L rahul ");
			break;
		case 8:
			System.out.println("Ravindra Jadeja");
			break;
		case 14:
			System.out.println("Abhishek sharma");
			break;
		default:
			System.out.println("unknown ");
		}
		
		System.out.println("main method ended !!");
		System.out.println("main method ended !!");
		System.out.println("main method ended !!");
		System.out.println("main method ended !!");
		System.out.println("main method ended !!");
		System.out.println("main method ended !!");
	}
}
