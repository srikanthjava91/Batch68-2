package com.oops.inheritance;

class Animal1 {
	public Animal1() {
		System.out.println("Animal Constrcutor called !");
	}

	void sound() {
		System.out.println("Animals Can sound ");
	}

}

class Monkey extends Animal1 {
	@Override
	void sound() {
		System.out.println("Monkey sounds pch pchhhhhhhhhhhhh");
	}

}

class Vehicle {
	public Vehicle() {
		System.out.println("Vehicle Constrcutor called !");
	}

	void sound() {
		System.out.println("Vehicles can sound !");
	}
}

class Car extends Vehicle {
	public Car() {
		System.out.println("Car constructor Called ");
	}

}

public class TestMultipleInheritnace {

	public static void main(String[] args) {
		System.out.println("main method started ");
		Car c1 = new Car();
		c1.sound();
		System.out.println("main method ended ");

	}

}
