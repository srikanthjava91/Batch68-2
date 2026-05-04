package com.Stringhandling;

public class TestStrDemo6 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		String str = "Java is simple";

		System.out.println(str.codePointAt(1));//
		System.out.println(str.codePointBefore(1));//
		System.out.println(str.codePointCount(1, 4));

		String str1 = "Advaith";// 100
		String str2 = "Abhigna";// 98

		System.out.println(str1.compareTo(str2));// 2

		String str3 = "Abhi";// 98
		String str4 = "ABHI";// 66
		System.out.println(str3.compareTo(str4));// 32
		System.out.println(str3.compareToIgnoreCase(str4));// 0

		String str5 = "Good";
		String str6 = "Good Morning";
		System.out.println(str6.compareTo(str5));

		String str7 = "Srikanth";
		String str8 = "Java";

		System.out.println(str7.concat(str8));// SrikanthJava
		System.out.println(str7 + str8);// SrikanthJava

		int i1 = 100;
		int i2 = 200;

		System.out.println(str7 + str8 + i1 + i2);// SrikanthJava100200: String + anything is String

	}

}
