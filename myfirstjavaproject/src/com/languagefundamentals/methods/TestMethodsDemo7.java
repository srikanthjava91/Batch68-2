package com.languagefundamentals.methods;

import java.util.Scanner;

//with return type + with arguments.
//WAP to get the Areas of Triangle, Square, Rectangle & Circle.
//Areas of Triangle :0.5 * base * height 
//Area  of square 	: side * side 
//Area of Rectangle : length * breadth 
//Area of Circle 	: PI * r * r 
public class TestMethodsDemo7 {

	void main(String[] args) {
		System.out.println("main method strated ");
		Scanner s = new Scanner(System.in);

		System.out.println("Enter Base : ");
		double b = s.nextDouble();
		System.out.println("Enter Height : ");
		double h = s.nextDouble();

		System.out.println("Enter Radius ");
		double r = s.nextDouble();

		// Finding ARea of Triangle
		double arTr = findAreaOfTriangle(b, h);
		System.out.println("Area of Triangle : " + arTr);

		// Finding Area of Circle
		double arCr = findAreaOfCircle(r);
		System.out.println("Area of Circle : " + arCr);
		s.close();
	}

	// 0.5 * base * height
	double findAreaOfTriangle(double base, double height) {
		double areaOfTr = 0.0;
		areaOfTr = 0.5 * base * height;
		return areaOfTr;
	}

	// PI * r * r
	double findAreaOfCircle(double radius) {
		double areaOfcr = 0.0;
		areaOfcr = Math.PI * radius * radius;
		return areaOfcr;
	}

}
