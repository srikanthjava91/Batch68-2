package com.oops.abstracion;

public class TestAnimal {
	
	
	int a = 10;

	public static void main(String[] args) {
//		Animal.orgName = "VSS";//The final field Animal.orgName cannot be assigned
		System.out.println("Welcome to Aimal PArk : " + Animal.orgName);

		Animal d = new Dog();
		d.eat();
		d.walk();
		d.sound();
		d.drink();
		d.friendly();
//		d.breath();//This static method of interface Animal can only be accessed as Animal.breath
		Animal.breath();
		
		System.out.println("*****************");
		Animal c = new Cat();
		c.eat();
		c.walk();
		c.sound();
		c.drink();
		c.friendly();
		Animal.breath();

		System.out.println("****************");
		Animal h = new Horse();
		h.eat();
		h.walk();
		h.sound();
		h.drink();
		h.friendly();

		System.out.println("*****************");
		Animal m = new Monkey();
		m.drink();
		m.friendly();

	}

}
