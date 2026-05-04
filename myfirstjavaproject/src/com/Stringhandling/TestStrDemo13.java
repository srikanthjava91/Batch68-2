package com.Stringhandling;

import java.util.Scanner;

//WAP to print String in a Reverse order using getBytes()..?
public class TestStrDemo13 {

	public static void main(String[] args) {
		System.out.println("main method tsrated ");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");// Java --> 0 1 2 3
		String str = sc.nextLine();

		byte[] arrBytes = str.getBytes();

		for (int i = 0; i < arrBytes.length / 2; i++) {

			byte temp = arrBytes[i];// J a
			arrBytes[i] = arrBytes[arrBytes.length - i - 1];// a v
			arrBytes[arrBytes.length - i - 1] = temp;// J

		}

		String reversed = new String(arrBytes);
		System.out.println("Reverse String of Given String : " + reversed);
	}
}
