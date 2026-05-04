package com.exceptionhandling;

public class TestExDemo8 {

	public static void main(String[] args) {

		System.out.println("main method strated  ");

		try {
			System.out.println("in try ");
			System.exit(0);
			return;
		}

		finally {
			System.out.println("in finally");
		}
	}
}
