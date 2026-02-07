package com.arrays;

import java.util.Scanner;

public class TestArraysDemo16 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);
		System.out.println("How many times we want to Rotate an array : ");
		int r = sc.nextInt();
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
		rotationalArray(arr, r);
		System.out.println("after Reverse : ");
		for (int a : arr) {
			System.out.print(a + " ");
		}
	}

	static void rotationalArray(int[] arr, int r) {
		int start = 0;
		int end = arr.length - 1;

//		Step1: Reverse the Given Array 
		reverseArray(arr, start, end);

//		Step2: Reverse the First Half Array only.
		reverseArray(arr, start, r - 1);

//		Reverse the Second Half array.
		reverseArray(arr, r, end);
	}

	static void reverseArray(int arr[], int start, int end) {
		int temp = 0;

		while (start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}

	}

}
