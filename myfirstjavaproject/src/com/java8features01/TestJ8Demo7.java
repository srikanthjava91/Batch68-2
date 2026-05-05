package com.java8features01;

@FunctionalInterface
interface In7 {
	void hello(String s);

	default void method2() {
		System.out.println("method2 called ");
	}
}

public class TestJ8Demo7 {

	public static void main(String[] args) {

		In7 i = s -> System.out.println(s.length());
		i.hello("Java8 is more simple");
		i.method2();
	}
}
