package com.java8features01;

@FunctionalInterface
interface In2 {
	public abstract void addition(int a, int b);
}

public class TestJ8Demo2 {

	public static void main(String[] args) {

		In2 t2 = (a, b) -> {
			int sum = a + b;
			System.out.println("sum of two value is  : " + sum);
		};
		t2.addition(10, 20);

	}

}
