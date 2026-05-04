package com.collectionsframeworks;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollectionDemo3 {

	public static void main(String[] args) {

		Collection<String> team1 = new ArrayList<>();
		team1.add("Ishan");
		team1.add("Abhishek");
		team1.add("Gill");
		team1.add("KL Rahul");

		Collection<String> team2 = new ArrayList<>();
		team2.add("Gill");
		team2.add("KL Rahul");
		team2.add("Ishan");
		team2.add("Ishan");
		team2.add("Ishan");

		System.out.println(team1.containsAll(team2));

	}

}
