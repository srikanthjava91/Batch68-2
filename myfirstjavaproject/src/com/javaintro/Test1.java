package com.javaintro;

public class Test1 {

	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println("Welcome to JVM Architecture !");
		System.out.println(Class.forName("com.javaintro.Cricketer"));
		System.out.println(Class.forName("com.mysql.cj.jdbc.Driver"));
	}
}
