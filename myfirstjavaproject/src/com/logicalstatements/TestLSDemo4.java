package com.logicalstatements;

import java.util.Scanner;

//Nested if else
public class TestLSDemo4 {

	public static void main(String[] args) {
		System.out.println("Welcome to Vcube Matrimonial ");

		Scanner sc = new Scanner(System.in);
		System.out.println("What is your name ?");
		String name = sc.next();

		System.out.println("Okay Mr: " + name + " : Shall we start the conversation ..? ");

		System.out.println("Can you please enter you assets & salary info ");
		double assets = sc.nextDouble();
		System.out.println("Salary also .. ");
		double salary = sc.nextDouble();

		if (assets >= 50000000.00 && salary >= 2500000.00) {
			System.out.println("Oh okay !! ");
			System.out.println("Can you please enter your age : ");
			int age = sc.nextInt();
			if (age >= 25 && age <= 28) {
				System.out.println("Oh nice !!");
				System.out.println("Enter your weight and height");

				double weight = sc.nextDouble();
				System.out.println("Height also ");

				double height = sc.nextDouble();

				if (weight >= 60 && weight <= 72 && height >= 5.5 && height <= 6.2) {
					System.out.println(" your profile almost matches to our requirements !! we have few more questions.");
					
					System.out.println("DO you have sibling ..? ");
					boolean sibStatus = sc.nextBoolean();
					
					if(sibStatus) {
						System.out.println("sorry you can leave for the day !!!");
					}else {
						System.out.println("We will come back later !!");
					}
					
				} else {
					System.out.println("Better to join gym !! or you are too short ");
				}

			} else {
				System.out.println("Your age is not matching with our profile !!");
			}

		} else {
			System.out.println("Better luck next time !!");
		}

	}

}
