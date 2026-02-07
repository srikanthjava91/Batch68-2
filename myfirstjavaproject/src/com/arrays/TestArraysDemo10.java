package com.arrays;

import java.util.Scanner;

//2D arrays : Whenever we want represent rows and columns we can choose one of the concept called 2D arrays.
public class TestArraysDemo10 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);

		int[][] numbers = new int[2][3];// 2 rows 3 column -> 6positions

		// 0 1 --> // 0 1 2 --> 00 01 02
//						     --> 10 11 12 

		System.out.println(numbers.length);
		System.out.println(numbers[0].length);// 3
		System.out.println(numbers[1].length);// 3

//		System.out.println("Enter values fro 2D array ");
//		for (int i = 0; i < numbers.length; i++) {
//			for (int j = 0; j < numbers[i].length; j++) {
//				numbers[i][j] = sc.nextInt();
//			}
//		}

//		for (int[] n1 : numbers) {
//			for (int n : n1) {
//				System.out.print(n + " ");
//			}
//			System.out.println();
//		}

		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				System.out.print(numbers[i][j] + " ");
			}
			System.out.println();
		}

	}

}
