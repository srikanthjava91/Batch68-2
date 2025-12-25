package com.constructors;

class BuntyFather {

	int age;
	String name;

	public BuntyFather() {
		super();
	}

	public BuntyFather(int age, String name) {
		this.age = age;
		this.name = name;
	}

}

public class Bunty extends BuntyFather {

	public static void main(String[] args) {
		Bunty b = new Bunty();

	}

}
