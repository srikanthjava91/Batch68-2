package com.Stringhandling;

public class TestStrDemo11 {

	public static void main(String[] args) {

		String str1 = "Java is simple in Vcube at Jntu in hyderabad";

		System.out.println(str1.indexOf('a'));// 1
		System.out.println(str1.lastIndexOf('a'));// 42

		System.out.println(str1.indexOf('a', str1.indexOf('a') + 1));// 3
		System.out.println(str1.indexOf('a', str1.indexOf('a', str1.indexOf('a') + 1) + 1));
		System.out.println(str1.indexOf("in"));// 15
	}
}
