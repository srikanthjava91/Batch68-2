package com.collectionsframeworks.map;

//WAP to find sum of total marks and avg of the marks..? 
public class TestDemo1 {

	public static void main(String[] args) {

		int[] marks = { 99, 98, 97, 96, 99, 97 };
		double sum = 0;
		double avg = 0;

		for (int m : marks) {
			sum = sum + m;
		}
		
		avg = sum/marks.length;

		System.out.println("SUm of the marks : " + sum);
		System.out.println("Avg of the marks : " + avg);

	}

}
