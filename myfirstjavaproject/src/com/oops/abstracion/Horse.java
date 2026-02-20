package com.oops.abstracion;

public class Horse implements Animal {

	@Override
	public void sound() {
		System.out.println("Horse can sounds like uffuffuff");
	}

	@Override
	public void eat() {
		System.out.println("Horse can eat grass");
	}

	@Override
	public void walk() {
		System.out.println("Harse can walk fast and alaso runs fast !!");
	}

	@Override
	public void drink() {
		System.out.println("Horse can drink Special water !!");
	}

	@Override
	public void sleep() {

	}
}
