package com.Stringhandling;

import java.util.Scanner;

//WAP to find Max occurrences char from Given String ..? 
//input is : abbccc 
//output   : c
public class TestStrDemo21 {

	public static void main(String[] args) {
		System.out.println("main method strated ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str = sc.next();// abbccc

		int[] arr = new int[127];// 0 1 2 3 4 ...126

		for (int i = 0; i < str.length(); i++) {
			arr[str.charAt(i)] = arr[str.charAt(i)] + 1;
		}

		int max = -1;// 1 2 3
		char maxChar = ' ';// a b c

		for (int i = 0; i < str.length(); i++) {
			if (arr[str.charAt(i)] > max) {
				max = arr[str.charAt(i)];
				maxChar = str.charAt(i);
			}

		}

		System.out.println("Max Occrences Char is : " + maxChar);

	}

}
