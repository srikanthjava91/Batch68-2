package com.Stringhandling;

public class TestStrDemo16 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		String str = "Java   is     simple in Vcube at JNTU Hyderabad";

		String[] words = str.split("\\s+");
		int count = 0;

		for (String word : words) {
			System.out.println(word);
			count++;
		}

		System.out.println("Count of words from Given String: " + count);

	}
}
