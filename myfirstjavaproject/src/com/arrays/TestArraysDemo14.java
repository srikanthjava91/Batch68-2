package com.arrays;

//Bubble Sort : Comparing adjacent elements and swap the elements based on the values 
public class TestArraysDemo14 {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4 };
		int temp = 0;
		int count = 0;
		int count1 = 0;

		System.out.println(arr.length);
		for (int i = 0; i <= arr.length - 1; i++) {
			boolean status = false;

			System.out.println("count : " + count++);
			for (int j = 0; j < arr.length - 1 - i; j++) {
				System.out.println("count1 : " + count1++);
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					status = true;
				}
			}

			if (!status) {
				break;
			}
		}

		for (int a : arr) {
			System.out.print(a + " ");
		}

		System.out.println("***********************");
		System.out.println(arr[arr.length - 2]);

	}

}
