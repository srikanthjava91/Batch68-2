package com.languagefundamentals.methods;

import java.util.Scanner;

public class TestMethodsDemo10 {

	public static void main(String[] args) {
		System.out.println("main method started !");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.print(i + " ");
			}
		}
	}
}
