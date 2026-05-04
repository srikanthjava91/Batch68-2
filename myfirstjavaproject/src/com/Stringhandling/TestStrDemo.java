package com.Stringhandling;

import java.util.Arrays;
import java.util.Scanner;

//WAP to find the Given Two String are anagram or not ..? 
//ex : listen silent 
//ex L race care
//ex: cat act 
public class TestStrDemo {

	public static void main(String[] args) {

		System.out.println("main method started ");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str1 = sc.next();// cat

		System.out.println("Enter another String : ");
		String str2 = sc.next();// act

		char[] arrStr1 = str1.toCharArray();// r a c e
		char[] arrStr2 = str2.toCharArray();// c a r e

		Arrays.sort(arrStr1);// a c e r
		Arrays.sort(arrStr2);// a c e r

		boolean status = Arrays.equals(arrStr1, arrStr2);

		if (status) {
			System.out.println("The both Strings are Anagram !!");
		} else {
			System.out.println("The both Strings are not Anagram !!");
		}

	}

}
