package com.exceptionhandling;

public class TestExDemo5 {

	public static void main(String[] args) {

		System.out.println("main method strated !!");
		int[] numbers = new int[4];

		try {
			numbers[0] = 101;
			numbers[1] = 102;
			numbers[2] = 103;
			numbers[3] = 104;
			numbers[4] = 105;
		} catch (ArrayIndexOutOfBoundsException ae) {
			System.err.println(ae.getMessage());
		}

		for (int num : numbers) {
			System.out.println(num);
		}

		System.out.println("main method ended !!");
	}

}
