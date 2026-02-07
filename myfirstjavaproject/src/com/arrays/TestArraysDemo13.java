package com.arrays;

import java.util.Scanner;

//WAP to find the prime numbers from Given Array ..?
public class TestArraysDemo13 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a size : ");
		int size = sc.nextInt();

		int[] numbers = new int[size];// 5

		System.out.println("Enter numbers for an array ");
		for (int i = 0; i < size; i++) {
			numbers[i] = sc.nextInt();
		}

		System.out.println("Prime numbers from given array : ");
		for (int i = 0; i < numbers.length; i++) {
			boolean status = true;

			if (numbers[i] == 0 || numbers[i] == 1) {
				status = false;
			}

			for (int j = 2; j <= numbers[i] / 2; j++) {
				if (numbers[i] % j == 0) {
					status = false;
					break;
				}
			}

			if (status) {
				System.out.print(numbers[i] + " ");
			}

		}

		System.out.println("main method ended ! ");

	}

}
