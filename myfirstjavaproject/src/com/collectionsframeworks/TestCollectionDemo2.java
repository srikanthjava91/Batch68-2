package com.collectionsframeworks;

import java.util.Collection;
import java.util.ArrayList;

public class TestCollectionDemo2 {

	public static void main(String[] args) {

		Collection<String> boys = new ArrayList<>();

		boys.add("Nithish");
		boys.add("Suresh");
		boys.add("Kishore");
		boys.add("Bharath");
		boys.add("Bharath");
		boys.add("Yashwanth");
		boys.add("Umesh");
		boys.add("Ramesh");

		System.out.println(boys);
		Collection<String> girls = new ArrayList<>();
		girls.add("Lakshmi");
		girls.add("Anjali");
		girls.add("Keerthi");
		girls.add("Gowri");
		girls.add("Shivani");
		girls.add("Abhigna");

		System.out.println(girls);
		Collection<String> students = new ArrayList<>();

		students.addAll(boys);
		students.addAll(girls);

//		boys.clear();
		System.out.println(boys);// []
		System.out.println(students);

		System.out.println(boys.contains("Bharath"));// true
		System.out.println(boys.contains("Srikanth"));// false
		System.out.println("************");
		System.out.println(students.containsAll(boys));// true
		System.out.println(boys.containsAll(girls));// false

		Collection<String> team1 = new ArrayList<>();
		team1.add("Ishan");
		team1.add("Abhishek");
		team1.add("Gill");
		team1.add("KL Rahul");

		Collection<String> team2 = new ArrayList<>();
		team2.add("Gill");
		team2.add("KL Rahul");
		team2.add("Srikanth");
		team2.add("Kishore");

		Collection<String> cricketers = new ArrayList<>();
		cricketers.addAll(team1);
		cricketers.addAll(team2);

		cricketers.removeAll(team1);
		System.out.println(cricketers);

//		System.out.println(team1.containsAll(team2));

	}

}
