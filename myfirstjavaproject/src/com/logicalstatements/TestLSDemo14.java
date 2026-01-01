package com.logicalstatements;

import java.util.Scanner;

//Q) WAP to print factors or divisors of a given number.?
//ex: input : 6 
//ex: output : 1 2 3 6 

//ex: input : 9 
//ex: output : 1 3 9 

//ex: input : 12 
//ex: output : 1 2 3 4 6 12 

//ex: input : 24 
//ex: outout : 1 2 3 4 6 8 12 24 

//ex: input :28 
//ex: output : 1 2 4 7 14 28 
public class TestLSDemo14 {

	static void findFactors(int num) {
		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println(num);
	}

	public static void main(String[] args) {
		System.out.println("main method started !");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();

		// calling the method by value
		findFactors(n);
		System.out.println();
		System.out.println("main method ended !");
	}
}
