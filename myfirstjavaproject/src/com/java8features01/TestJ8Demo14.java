package com.java8features01;

import java.util.Date;
import java.util.function.Supplier;

public class TestJ8Demo14 {

	public static void main(String[] args) {

		Supplier<String> s1 = () -> {
			String str = "hello";
			return str;
		};

		System.out.println(s1.get());
		Supplier<Date> s2 = () -> new Date();
		System.out.println(s2.get());
	}
}
