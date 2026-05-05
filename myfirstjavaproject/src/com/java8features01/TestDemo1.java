package com.java8features01;

//WAP to print sum and avg of all the marks..? 
public class TestDemo1 {

	void main() {

		int[] marks = { 97, 95, 94, 96, 92, 99 };

		double sum = 0;
		double avg = 0;

		for (int m : marks) {
			sum += m;
		}

		avg = sum / marks.length;

		System.out.println("sum of the total marks : " + sum);
		System.out.println("avh of the total marks : " + avg);

	}

}
