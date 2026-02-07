package com.arrays;

//WAP to print sum of all the marks & avg of all the marks 
public class TestArraysDemo5 {

	public static void main(String[] args) {
		System.out.println();

		int[] marks = { 72, 41, 62, 58, 65, 71 };
		double sum = 0;
		double avg = 0;

		for (int i = 0; i < marks.length; i++) {
			sum = sum + marks[i];
		}
		
		avg = sum/marks.length;

		System.out.println("Sum of all the marks : " + sum);
		System.out.println("Avg of all marks : " + avg);

	}

}
