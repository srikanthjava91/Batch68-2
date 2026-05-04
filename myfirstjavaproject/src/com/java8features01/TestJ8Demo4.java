package com.java8features01;

//Whenever we have multiple statements then we can go for {} and 
//if the method have return statements then also we should use {}.
@FunctionalInterface
interface In4 {
	void method4();
}

public class TestJ8Demo4 {

	public static void main(String[] args) {
		In4 i = () -> {
			System.out.println("Hello method4");
			System.out.println("Hello method4");
			System.out.println("Hello method4");
			System.out.println("Hello method4");
		};
		i.method4();
	}

}
