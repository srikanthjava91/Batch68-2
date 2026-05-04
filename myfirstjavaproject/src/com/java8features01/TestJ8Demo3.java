package com.java8features01;

@FunctionalInterface
interface In3 {
	public abstract int sqrt(int a);
}

public class TestJ8Demo3 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		In3 i3 = a -> {return a * a;};
		System.out.println(i3.sqrt(10));
		System.out.println("main method ended ");
	}

}
