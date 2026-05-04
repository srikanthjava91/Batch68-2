package com.Stringhandling;

public class TestStrDemo7 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		String[] arr = { "AbhiShek", "Sanju Samson", "Ishan", "Sky", "Virat", "Tilak", "Rohit SHarma", "Srikanth",
				"Srinivas" };

		for (String str : arr) {

			if (str.startsWith("Sr")) {
				System.out.println(str);
			}

			if (str.endsWith("n")) {
				System.out.println(str);
			}

			if (str.toLowerCase().contains("sh")) {
				System.out.println(str);
			}
		}
	}
}
