package com.arrays;

// WAP to mix two arrays into a single array..? 
public class TestArraysDemo9 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		int[] a1 = { 1, 2, 3 };
		int[] b1 = { 4, 5, 6 };
		int[] c1 = new int[a1.length + b1.length];

		for (int i = 0; i < a1.length; i++) {
			c1[i] = a1[i];
		}

		for (int i = 0; i < b1.length; i++) {
			c1[a1.length + i] = b1[i];
		}

		System.out.println("Representing array ");
		for (int i = 0; i < c1.length; i++) {
			System.out.print(c1[i] + " ");
		}
	}

}
