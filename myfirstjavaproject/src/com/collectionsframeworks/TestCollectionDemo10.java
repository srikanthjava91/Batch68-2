package com.collectionsframeworks;

import java.util.ArrayList;
import java.util.List;

public class TestCollectionDemo10 {

	public static void main(String[] args) {

		List<String> team1 = new ArrayList<>();
		team1.add("Tilak");
		team1.add("Arya");
		team1.add("Priyansh");
		team1.add("Soorya");
		System.out.println(team1);
		System.out.println(team1.get(3));
		System.out.println(team1.indexOf("Arya"));

		List<String> team2 = new ArrayList<>();
		team2.add("Jaiswal");
		team2.add("Gill");
		team2.add("Abhishek");
		team2.add("Shreyash");
		System.out.println(team2);

		List<String> team3 = new ArrayList<>();
		team3.add("Srikanth");
		team3.add("pawan");
		team3.add("Bharath");
		team3.add("Kishore");
		System.out.println(team3);

		List<String> names = new ArrayList<>();
		names.addAll(team1);
		names.addAll(team2);
		names.addAll(1, team3);

		System.out.println(names);

		System.out.println("************************");
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}

	}

}
