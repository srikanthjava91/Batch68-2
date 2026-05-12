package com.java8features01.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//WAP to print only EVven numbers from a List of Data.?
public class TestStreamDemo1 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(10, 20, 31, 34, 36, 76, 87, 91);
		List<Integer> list1=list.stream()
								.filter(i->i%2==0)
								.collect(Collectors.toList());
		System.out.println(list1);
		
		List<String> names = Arrays.asList("Tilak", "Rohit", "Dhoni", "Virat", "Sky", "Pandya", "Abishek", "Vaibhav");
		List<String> names1 = names.stream()
								   .filter(s-> s.contains("i"))
								   .collect(Collectors.toList());
		System.out.println(names1);
		
		

	}

}
