package com.logicalstatements;

import java.util.Scanner;

//input is : 5 
//output : 
//5 x 1 = 5
//5 x 2 = 10
//5 x 3 = 15
//5 x 4 = 20
//5 x 5 = 25
//5 x 6 = 30
//5 x 7 = 35
//5 x 8 = 40
//5 x 9 = 45
//5 x 10 = 50

public class TestLSDemo15 {

	public static void main(String[] args) {
		System.out.println("main method started !");
		Scanner sc = new Scanner(System.in);

		System.out.println("enter a number to print math table");
		int n = sc.nextInt();

		System.out.println("enter upto where you want to print");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			System.out.println(n + " X " + i + " = " + n * i);
		}

	}

}
