package com.arrays;

//Selection Sorting 
public class TestArraysDemo15 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		int[] arr = { 4, 2, 3, 1 };
		int temp = 0;

		for (int i = 0; i < arr.length; i++) {
			int minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}

		System.out.println("Sorting an arry :");

		for (int a : arr) {
			System.out.print(a + " ");
		}

	}
}
