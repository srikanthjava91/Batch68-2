package com.exceptionhandling;

import java.util.Scanner;

public class TestCustomException {

	void main(String[] args) throws ObulException {
		System.out.println("main method started !!");
		validation();

	}

	void validation() throws ObulException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age : ");
		int age = sc.nextInt();

		if (age > 18) {
			System.out.println("YOu are eleigible for Driving or Voting ");
		} else {
			throw new ObulException("Babu niku inka time undi ra thondarapadaku !");
		}
	}

}
