package com.logicalstatements;

import java.util.Scanner;

//WAP to print sum of the Given digits...? 
//input : 123 --> output : 6
//input : 567 --> output : 18
public class TestLSDem21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();// 345
		int r = 0;
		int sum = 0;

//		10)345(34     10)34(3     10) 3(0 
//		   340 			 30          0 
//		--------       ----------  --------------
//		   5 			 4           3
		while (n != 0) {
			r = n % 10;// 345 % 10 --> 5, 34%10 --> 4, 3%10 --> 3
			n = n / 10; // 345/10 --> 34/10 --> 3, 3/10 --> 0
			sum = sum + r;// 5+ 4 + 3 = 12
		}

		System.out.println("sum of digits : " + sum);

	}
}
