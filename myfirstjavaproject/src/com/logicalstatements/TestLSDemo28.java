package com.logicalstatements;

import java.util.Scanner;

public class TestLSDemo28 {

	public static void main(String[] args) {
		System.out.println("main method started !!");
		Scanner sc = new Scanner(System.in);
		String yn = "";
	
		do {
		
			System.out.println("Enter a number : ");
			int a = sc.nextInt();
			System.out.println("Enter b number : ");
			int b = sc.nextInt();

			System.out.println("Enter a symbol to proceed like + - * % /");
			String symb = sc.next();
			int result = 0;

			switch (symb) {

			case "+" -> result = a + b;
			case "-" -> result = a - b;
			case "%" -> result = a % b;
			case "/" -> result = a / b;
			case "*" -> result = a * b;
			default -> System.out.println("Invalid symbol to proceed : ");
			}

			System.out.println("Resulted value is : " + result);
			
			System.out.println("Do you want to continue ..? Click Y for Yes N for NO");
			yn = sc.next();
			
		}while(yn.equalsIgnoreCase("Y"));

		System.out.println("main method ended !!");
	}

}
