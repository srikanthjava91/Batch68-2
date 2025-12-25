package com.javaintro;

public class TestDemo9 {

	void main(String[] args) {
		System.out.println("main method started ");
		System.out.println("Thread name :  " + Thread.currentThread().getName());
		hello();
		System.out.println("main method ended ");
	}

	void hello() {
		System.out.println("Thread name from hello:  " + Thread.currentThread().getName());
	}

}
