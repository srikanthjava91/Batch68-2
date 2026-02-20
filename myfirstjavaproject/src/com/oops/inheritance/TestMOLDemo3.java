package com.oops.inheritance;

//WAP to find area of Rectangle, Circle, Square & Triangle 

public class TestMOLDemo3 {

	void main() {
		System.out.println("main method started !!");

		System.out.println("Area od rectangle : " + findArea(100.5, 200.9));
		System.out.println("Area of Circle : " + findArea(5.9));
		System.out.println("Area of Square : " + findArea(10.5F));
		System.out.println("Area of Triangle : " + findArea(10.5, 5.5F));

	}

	double findArea(double length, double breadth) {
		return length * breadth;
	}

	double findArea(double radius) {
		return Math.PI * radius * radius;
	}

	double findArea(float side) {
		return side * side;
	}

	double findArea(double base, float height) {
		return 0.5 * base * height;
	}

}
