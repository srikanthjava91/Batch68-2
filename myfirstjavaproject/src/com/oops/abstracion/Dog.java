package com.oops.abstracion;

public class Dog implements Animal {

	@Override
	public void sound() {
		System.out.println("Dog can sound like Bow Bow bow.........");

	}

	@Override
	public void walk() {
		System.out.println("Dog can walk and also run like anything !!");
	}

	@Override
	public void eat() {
		System.out.println("Dog can eat meat !!!");

	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub

	}

	@Override
	public void friendly() {
		System.out.println("Actully dogs are friendly but not street dogs !!");
	}

}
