package com.logicalstatements;

import java.util.Scanner;

//Q) WAP to print fibonacci series for a given number..?
//input : 7 
//output : 0 1 1 2 3 5 8 13 21 
public class TestLSDemo18 {

	public static void main(String[] args) {
		System.out.println("main method started !");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();

		int n1 = 0;
		int n2 = 1;

		int n3 = 0;

		System.out.print(n1 + " " + n2);

		// how many times you want to print
		for (int i = 1; i <= n; i++) {
			n3 = n1 + n2;// 0 1 1 2 3 5
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
		}
	}

}
