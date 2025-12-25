package com.constructors;

//Parent or Super or Base 
class Vehicle {
	String model;
	String brand;

	Vehicle() {
		System.out.println("Vehicle no arg constructor called ");
	}

	Vehicle(String model, String brand) {
		System.out.println("Vehicle parametrized constructor called ");
	}

	public static void main(String[] args) {
		System.out.println("main method started from vehicle ");
	}
}

//Child or Sub or Derived 
public class Bike extends Vehicle {

	Bike() {
		super();
		System.out.println("Bike no arg constructor called !");
	}

	Bike(String model, String brand) {

		System.out.println("parameterized constructor called ");
		this.model = model;
		this.brand = brand;
	}

	public static void main(String[] args) {
		System.out.println("main method started from Bike ");

		Bike b1 = new Bike("Sonet", "KIA");
		b1.show();

		System.out.println("main method ebded from Bike ");
	}

	void show() {
		System.out.println(model);
		System.out.println(brand);
	}
}
