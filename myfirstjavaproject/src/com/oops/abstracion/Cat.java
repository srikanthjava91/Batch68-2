package com.oops.abstracion;

public class Cat implements Animal {

	@Override
	public void sound() {
		System.out.println("Cat sounds like Meow Meow !!!");

	}

	@Override
	public void walk() {
		System.out.println("Cat walk always nice !!");

	}

	@Override
	public void eat() {
		System.out.println("Cat can eat rat !!");

	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub

	}

	@Override
	public void drink() {
		System.out.println("Cat drinks milk !!");
	}

}
