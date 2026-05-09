package com.java8features01;

//WAP to find sum & avg of total marks of 10th class student..?
public class TestDemo10 {

	public static void main(String[] args) {

		int[] marks = { 98, 99, 96, 95, 89, 92 };

		double sum = 0;// 98 197
		double avg = 0;

		for (int m : marks) {
			sum = sum + m;
		}
		
		avg = sum/marks.length;

		System.out.println("sum of the all marks : " + sum);
		System.out.println("acg of the all marks : " + avg);

	}

}
