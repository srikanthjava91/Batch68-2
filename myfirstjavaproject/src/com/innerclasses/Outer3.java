package com.innerclasses;

abstract class Animal {
	abstract void sound();

	abstract void eat();
}

public class Outer3 {
	public static void main(String[] args) {
		Animal dog = new Animal() {
			@Override
			void sound() {
				System.out.println("Bark");
			}

			@Override
			void eat() {
				System.out.println("DOg eat non-veg too ");
			}
		};
		dog.sound();
		dog.eat();
	}
}
