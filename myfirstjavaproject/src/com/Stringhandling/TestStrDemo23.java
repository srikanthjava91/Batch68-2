package com.Stringhandling;

public class TestStrDemo23 {

	public static void main(String[] args) {

		// String is Immutable
		// String is not a Thread safe 
		String s1 = "Ravindra";
		s1.concat("Jadeja");
		System.out.println(s1);

		// StringBuffer is Mutable & Thread safe 
		StringBuffer sb1 = new StringBuffer("MahendraSingh");
		sb1.append("Dhoni");
		System.out.println(sb1);

		// StringBuilder is Mutable & not a Thread safe
		StringBuilder sb2 = new StringBuilder("Srikanth");
		sb2.append("Java");
		System.out.println(sb2);

	}

}
