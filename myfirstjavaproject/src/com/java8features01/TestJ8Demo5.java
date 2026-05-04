package com.java8features01;


//Functional interface vs Inheritance 
@FunctionalInterface
interface In5 {
	void method5();
}

@FunctionalInterface
interface In6 extends In5 {
}

public class TestJ8Demo5 {

	public static void main(String[] args) {
		In6 i = () -> System.out.println("Hello method5");
		i.method5();
	}
}
