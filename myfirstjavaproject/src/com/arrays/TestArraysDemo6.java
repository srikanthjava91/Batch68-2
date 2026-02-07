package com.arrays;

//Q) WAP to find min & max number from given array ..? 
public class TestArraysDemo6 {

	public static void main(String[] args) {

		int[] numbers = { 1, 3, 4, 2, 10, 20, -15};// 0 1 2 3

		int min = numbers[0];// 1
		int max = numbers[0];// 1

		for (int n : numbers) {
			if (n < min) {
				min = n;
			} else if (n > max) {
				max = n;
			}
		}

//		for (int i = 1; i < numbers.length; i++) {
//			if (numbers[i] < min) {
//				min = numbers[i];
//			} else if (numbers[i] > max) {
//				max = numbers[i];
//			}
//		}

		System.out.println("Minimum number from an array : " + min);// 1
		System.out.println("Maximum number from an array : " + max);// 4

	}

}
