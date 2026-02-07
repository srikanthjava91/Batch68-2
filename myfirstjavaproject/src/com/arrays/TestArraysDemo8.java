package com.arrays;

//WAP to print array in a reverse order..? 
public class TestArraysDemo8 {

	public static void main(String[] args) {

		int[] n = { 1, 2, 3, 4,5,6 ,7 ,8 ,9, 10 };// 0 1 2 3

		for (int i = n.length - 1; i >= 0; i--) {
			System.out.print(n[i] +" ");
		}
	}
}
