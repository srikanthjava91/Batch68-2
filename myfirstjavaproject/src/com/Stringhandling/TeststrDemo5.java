package com.Stringhandling;

import java.util.Scanner;

//Q : WAP to print The given String in a Reverse Order..?
//Q : WAP and Find The Given String iS palindrome or not ..? 

//palindrome means the given string & The Reverse String Must be same..
public class TeststrDemo5 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str = sc.nextLine();// Java
		String rstr = "";

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);// Ja
			rstr = c + rstr;// avaJ
		}
		
		if(str.equalsIgnoreCase(rstr)) {
			System.out.println("The Given String is Palindrome ");
		}else {
			System.out.println("The Given String is not a Palindrome ");
		}

		System.out.println("The Reverse String of a Given String is : " + rstr);

	}

}
