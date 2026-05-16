package com.java8features01.streams;

import java.util.Optional;

public class TestOPDemo4 {

	public static void main(String[] args) {

		String[] names = { "Abhishek", "Virat", "Aditya", "Tilak", null, "kalssen", null, "Srikanth" };

		for (String name : names) {
			Optional<String> op = Optional.ofNullable(name);
			
			if (op.isPresent()) {
				System.out.println(op.get().toUpperCase());
			} else {
				System.out.println("name is not available ");
			}

		}

	}

}
