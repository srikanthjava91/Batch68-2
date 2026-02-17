package com.oops.inheritance;

//Grand Parent / Base Class
class Animal {

	String type = "Animal";

	void sound() {
		System.out.println("Animal makes sound");
	}

	void walk() {
		System.out.println("Animal can walk and also Run !");
	}
}

class Cat extends Animal {
	String type = "Cat";

	@Override
	void sound() {
		System.out.println("Cat SOunds like meow meow !");
	}
}

class BabyCat extends Cat {

	String type = "Baby Cat";

	@Override
	void sound() {
		System.out.println("Baby cats are souding like small meow meow");

	}

	void play() {
		System.out.println("baby cats are Cute when the play !");
	}

}

//Parent / Derived Class
class Dog1 extends Animal {

	String type = "Dog";

	@Override
	void sound() {
		System.out.println("Dog barks");
	}

	void eat() {
		System.out.println("Dog eats meat");
	}
}

//Child / Derived Class
class BabyDog extends Dog1 {

	String type = "Baby Dog";

	@Override
	void sound() {
		System.out.println("BabyDog makes small barking sound");
	}

	void play() {
		System.out.println("BabyDog plays with ball");
	}

}

public class TestMultiLevelInheritance {

	public static void main(String[] args) {

		System.out.println("Main method started");
		BabyDog bd = new BabyDog();

		System.out.println(bd.type); // Baby Dog
		bd.sound(); // BabyDog method
		bd.eat(); // Dog method
		bd.play(); // BabyDog method
		bd.walk();

		Cat c1 = new Cat();
		c1.sound();

		BabyCat bc = new BabyCat();
		bc.sound();

	}
}
