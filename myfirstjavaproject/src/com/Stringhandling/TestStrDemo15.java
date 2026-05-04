package com.Stringhandling;

public class TestStrDemo15 {

	public static void main(String[] args) {

		String str1 = "Java";
		String str2 = "Is";
		String str3 = "Simple";

		String slogan = String.join("-", str1, str2, str3);

		System.out.println("The Vcube SLogan is : " + slogan);

	}

}
