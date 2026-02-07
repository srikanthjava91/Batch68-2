package com.logicalstatements;

import java.util.Scanner;

//WAP to print the Reverse number of a given number ..? 
//WAP to find the Given number is Palindrome or not ..? 
public class TestLSDemo21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();// 123
		int temp = n;
		int r = 0;
		int rev = 0;

		while (n != 0) {
			r = n % 10;// 123%10 --> 3, 12%10 --> 2, 1%10 --> 1
			n = n / 10; // 123/10 --> 12, 12/10 --> 1 1/10 --> 0
			rev = rev * 10 + r;// 3 --> 32 --> 320+ 1 --> 321
		}

		System.out.println("Reverse number is :  :" + rev);

		if (temp == rev) {
			System.out.println("The Given number is Palindrome : ");
		} else {
			System.out.println("the Given number is not a palindrome : ");
		}
	}
}
