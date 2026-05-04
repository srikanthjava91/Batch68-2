package com.java8features01;

@FunctionalInterface
interface In1 {
	public abstract void method1();
}

public class TestJ8Demo1 {

	public static void main(String[] args) {

		In1 t1 = () -> {
			System.out.println("Java 8 is more simple !!");
		};
		t1.method1();

	}
}
