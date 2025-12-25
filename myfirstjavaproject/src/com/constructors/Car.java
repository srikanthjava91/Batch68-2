package com.constructors;

public class Car {
	String model;
	String brand;
	double price;

	Car() {
//		this();
		model = "unknown";
		brand = "unknown";
		price = 100000.00;
	}

	Car(String brand) {
		this();
		this.brand = brand;
	}

	Car(String brand, String model) {
		this(brand);
		this.model = model;
	}

	Car(String brand, String model, double price) {
		this(brand, model);
		this.price = price;
	}

	public static void main(String[] args) {
		System.out.println("main started !");
		Car c1 = new Car();
		c1.show();

		Car c2 = new Car("KIA");
		c2.show();

		Car c3 = new Car("Tata");
		c3.show();

		Car c4 = new Car("Honda");
		c4.show();

		Car c5 = new Car("KIA", "Sonet", 1400000.00);
		c5.show();
	}

	void show() {
		System.out.println("Model of the Car : " + model);
		System.out.println("Brand of the Car : " + brand);
		System.out.println("Price of the Car : " + price);
		System.out.println("******************************");
	}

}
