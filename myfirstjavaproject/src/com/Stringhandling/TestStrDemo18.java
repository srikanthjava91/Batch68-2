package com.Stringhandling;

public class TestStrDemo18 {

	public static void main(String[] args) {
		System.out.println("main method strated ");

		String s1 = "Srikanth";
		System.out.println(s1.substring(2));// sr sri ikanth
//		beginIndex the beginning index, inclusive.
//		endIndex the ending index, exclusive.
		System.out.println(s1.substring(4, 7));// ant
		System.out.println(s1.subSequence(4, 7));// ant

	}

}
