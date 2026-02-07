package com.arrays;

//WAP to represent an array with 10 elements..
public class TestArraysDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		// Declaration
		int[] numbers;

		// Creation
		numbers = new int[10];

		// Initialization
		numbers[0] = 10;
		numbers[1] = 18;
		numbers[2] = 45;
		numbers[3] = 1;
		numbers[4] = 4;

		// Represent an array

//		for (int i = 0; i < numbers.length; i++) {
//			System.out.print(numbers[i] +" ");
//		}
		
		for(int n:numbers) {
			System.out.print(n +" ");
		}

	}

}
