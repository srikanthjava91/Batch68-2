package com.arrays;

public class TestArraysDemo4 {

	public static void main(String[] args) {

		int[] arr = {};
		System.out.println(arr);// [I@2b2fa4f7

		int[] arr1 = { 10, 20 };
		System.out.println(arr1);// [I@2b2fa4f7
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
//		System.out.println(arr1[2]);

		String[] str = { "kohli", "Rohit", "Dhoni", "Jadeja" };// 0 1 2 3

		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i] +" ");
		}

//		for (String s : str) {
//			System.out.println(s);
//		}

	}

}
