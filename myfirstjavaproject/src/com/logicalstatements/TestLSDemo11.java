package com.logicalstatements;

import java.util.Scanner;

//Nested switch cases  --> fruits or vegetables  based on categories 
public class TestLSDemo11 {

	public static void main(String[] args) {
		System.out.println("main method started !!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Catogiry : ");
		String catg = sc.next();

		switch (catg) {
		case "fruits" -> {
			System.out.println("Enter item for Description and price");
			String item = sc.next();

			switch (item) {
			case "orn" -> System.out.println("Orange and 12 Oranges rate is 120 rs");
			case "mng" -> System.out.println("Mango's and 1KG Mango rate is 200 rs");
			case "gua" -> System.out.println("Guava and 1KG Guava rate is 60 rs");
			case "bnn" -> System.out.println("Bana and 12 Banana rate is 80 rs");
			default -> System.out.println("Entered item is not availabale !!");
			}

		}

		case "veggies" -> {
			System.out.println("Enter item for Description and price");
			String item = sc.next();

			switch (item) {
			case "tmt" -> System.out.println("Tomato and Kg 50rs ");
			case "ptt" -> System.out.println("Potato and Kg 60rs ");
			case "bnd" -> System.out.println("Bendi and Kg 40rs ");
			case "onn" -> System.out.println("Onions and Kg 30rs ");
			case "drm" -> System.out.println("Drumsticks and 12 100rs ");
			default -> System.out.println("Entered Vegetables are not available ! ");
			}

		}

		default -> System.out.println("Entered category is not available ");

		}

	}
}
