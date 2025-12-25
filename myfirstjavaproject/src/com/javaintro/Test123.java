package com.javaintro;

class Movie {
	// static block
	static {
		System.out.println("Title Screen: Once!");
	}

	// instance block
	{
		System.out.println("Scene Setup: Every time!");
	}

	public static void main(String[] args) {
		System.out.println("main method strated !");
		new Movie();
		new Movie();
		new Movie();
	}
}
