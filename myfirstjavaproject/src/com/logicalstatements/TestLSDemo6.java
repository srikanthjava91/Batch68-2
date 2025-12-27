package com.logicalstatements;

import java.util.Scanner;

//Enter T-shirt size and will get the description 
public class TestLSDemo6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter T-Shirt size ");
		int size = sc.nextInt();

		switch (size) {

		case 34 -> System.out.println("Xtra Small T shirt ");
		case 36 -> System.out.println(" Small T shirt ");
		case 38 -> System.out.println("Medium shirt ");
		case 40 -> System.out.println(" Large T shirt ");
		case 42 -> System.out.println(" X-Large T shirt ");
		case 44 -> System.out.println(" XX-Large T shirt ");
		default -> System.out.println("Entered size is not available !!");

//		case 34:
//			System.out.println("Xtra Small T shirt ");
//			break;
//		case 36:
//			System.out.println(" Small T shirt ");
//			break;
//		case 38:
//			System.out.println("Medium shirt ");
//			break;
//		case 40:
//			System.out.println(" Large T shirt ");
//			break;
//		case 42:
//			System.out.println(" X-Large T shirt ");
//			break;
//		case 44:
//			System.out.println(" XX-Large T shirt ");
//			break;
//		default:
//			System.out.println("Entered size is not available !!");

		}

	}

}
