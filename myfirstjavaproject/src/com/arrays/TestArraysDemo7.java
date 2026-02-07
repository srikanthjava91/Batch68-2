package com.arrays;

import java.util.Scanner;

// WAP to read the elements from a console for an array..? 
public class TestArraysDemo7 {

	public static void main(String[] args) {
		System.out.println("main method strated ");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a size : ");
		int size = sc.nextInt();

		int[] n = new int[size];// 5 --> 0 1 2 3 4

		System.out.println("Please enter " + size + " elements ");
		for (int i = 0; i < size; i++) {
			n[i] = sc.nextInt();
		}

		System.out.println("Representing an array : ");

		for (int i = 0; i < size; i++) {
			if (n[i] % 2 == 0) {
				System.out.print(n[i] + " ");
			}
		}

	}

}
