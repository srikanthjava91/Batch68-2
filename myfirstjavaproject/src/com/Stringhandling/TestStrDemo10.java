package com.Stringhandling;

public class TestStrDemo10 {

	public static void main(String[] args) {

		String str1 = "Srikanth";//
		String str2 = null;//
		String str3 = "";//
		String str4 = " ";//

		System.out.println(str1.isEmpty());// false
		System.out.println(str1.isBlank());// false

//		System.out.println(str2.isEmpty());//NPE
//		System.out.println(str2.isBlank());//NPE

		System.out.println(str3.isBlank());// true if the string is empty or contains only white space codepoints,
											// otherwise false
		System.out.println(str3.isEmpty());// true if length() is 0, otherwise false

		System.out.println(str4.isBlank());// true
		System.out.println(str4.isEmpty());// false

	}

}
