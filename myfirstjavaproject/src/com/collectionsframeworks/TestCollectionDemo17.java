package com.collectionsframeworks;

import java.util.Stack;

public class TestCollectionDemo17 {

	public static void main(String[] args) {
		Stack<String> ss = new Stack<>();
		
		System.out.println(ss.empty());//true

		ss.push("J2SE");
		ss.push("J2EE");
		ss.push("Spring");
		ss.push("Spring Boot");
		ss.push("Microservices");
		ss.push("SQL");
		ss.push("React");

		System.out.println(ss.empty());//false
		System.out.println(ss.pop());//React
		System.out.println(ss.peek());//SQL
		System.out.println(ss.search("Microservices"));
		System.out.println(ss);//

	}

}
