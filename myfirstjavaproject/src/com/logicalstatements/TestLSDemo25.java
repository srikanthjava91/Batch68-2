package com.logicalstatements;

import java.util.Scanner;

//Q) WAP to convert Decimal to Binary number ..? 
public class TestLSDemo25 {

	public static void main(String[] args) {
		System.out.println("main method started !!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");

		int n = sc.nextInt();// 4
		int r = 0;
		String bin = "";

		while (n != 0) {
			r = n % 2;// 4%2 = 0, 2%2 = 0,1%2=1
			n = n / 2;// 4/2 = 2, 2/2 =1,1/2=0
			bin = r + bin;// 100
		}

		System.out.println("Binary number from a Given Decimal :" + bin);

	}

}
