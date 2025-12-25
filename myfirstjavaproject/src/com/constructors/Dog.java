package com.constructors;

class AnimalParent {
	String name;

}

class Animal extends AnimalParent {

	int legs;
	String breed;

	Animal() {

		System.out.println("No arg constructor called from Animal ");
	}

	Animal(int legs, String breed) {

		System.out.println("Parameterized constructor called from Animal");
		this.legs = legs;
		this.breed = breed;
	}

}

public class Dog extends Animal {

	Dog() {
		super(4, "husky");
		System.out.println("no arg constructor called from Dog!");
	}

	public static void main(String[] args) {
		System.out.println("main method strated from Dog ");
		Dog d = new Dog();
		d.show();
		System.out.println("main method ended from Dog ");
	}

	void show() {
		System.out.println("Legs count : " + legs);
		System.out.println("Breed : " + breed);
	}

}
