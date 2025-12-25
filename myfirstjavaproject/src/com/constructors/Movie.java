package com.constructors;

public class Movie {

	String name;
	String hero;
	String director;
	String heroine;
	double budget;

	public Movie(String director, String hero) {
		this.director = director;
		this.hero = hero;
	}

	public Movie(Movie m, String name) {
		this.director = m.director;
		this.hero = m.hero;
		this.name = name;
	}

	public Movie(Movie m, String heroine, double budget) {

		this.director = m.director;
		this.hero = m.hero;
		this.name = m.name;
		this.heroine = heroine;
		this.budget = budget;
//		m.director = "Srikanth";
	}

	public static void main(String[] args) {
		System.out.println("Welcome to TFI !!");
		Movie m1 = new Movie("S S Rajamouli", "S S Mahesh babu");
		m1.show();

		Movie m2 = new Movie(m1, "Varanasi");
		m2.show();

		Movie m3 = new Movie(m2, "Priyanka Chopra", 4000000000.00);
		m3.show();
		m1.show();
	}

	void show() {
		System.out.println("Name of the movie : " + name);
		System.out.println("Hero of the Movie : " + hero);
		System.out.println("Director of the movie : " + director);
		System.out.println("Budget of the movie : " + budget);
		System.out.println("Heroine of the Movie : " + heroine);
		System.out.println("*****************************");

	}
}
