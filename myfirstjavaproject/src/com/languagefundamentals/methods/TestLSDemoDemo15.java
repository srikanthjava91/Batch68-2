package com.languagefundamentals.methods;

import java.util.Scanner;

//input : 6 
//output : 1 2 3 = 1+ 2 + 3 = 6 --> the given number is perfect 
public class TestLSDemoDemo15 {

	void main(String[] args) {
		System.out.println("main method started ");

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		boolean status = isPerfect(n);

		if (status) {
			System.out.println("the given number is perfect");
		} else {
			System.out.println("the given number is not  perfect");
		}

	}

	boolean isPerfect(int n) {
		boolean status = false;
		int sum = 0;

		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				sum = sum + i;
			}
		}
		
		
		if(sum == n) {
			status = true;
		}
		

		return status;

	}

}
