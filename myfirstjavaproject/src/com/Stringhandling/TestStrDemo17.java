package com.Stringhandling;

public class TestStrDemo17 {

	public static void main(String[] args) {
		String str = "Srikanth Java in Vcube where Java is simple";
		str = str.replace('i', 'e');
		System.out.println(str);
		str = str.replace("Java", "Spring");
		System.out.println(str);

		System.out.println("********************");
		String str2 = "AMIPC1234G";
		str2 = str2.replaceAll("\\d", "X");
		System.out.println(str2);

		System.out.println("-------------");

		String str5 = "               Hello Good Evening            ";
		System.out.println(str5.trim());// all leading and trailing space removed.
		System.out.println(str5.replaceAll("\\s", ""));

		String str3 = "Hello      world Java is simple";
		str3 = str3.replaceAll("\\s", "-");
		System.out.println(str3);

		String str4 = "Hello guys, Good MOrning, Good afternoon, Good evening";
		str4 = str4.replaceFirst("Good", "Great");
		System.out.println(str4);

	}
}
