package com.collectionsframeworks;

import java.util.ArrayList;
import java.util.List;

public class TestCollectionDemo11 {

	public static void main(String[] args) {

		List<String> team1 = new ArrayList<>();
		team1.add("Tilak");
		team1.add("Tilak");
		team1.add("Arya");
		team1.add("Priyansh");
		team1.add("Soorya");
		System.out.println(team1);// Tilak Arya Priyansh Soorya
		System.out.println(team1.get(3));// Soorya
		System.out.println(team1.indexOf("Arya"));// 1
		team1.remove("Tilak");
		System.out.println(team1);
		
		List<Integer> team2 = new ArrayList<>();
		team2.add(5);
		team2.add(6);
		team2.add(7);
		team2.add(9);
		team2.add(8);
		team2.remove(team2.indexOf(9));
		System.out.println(team2);//5 6 7 8 

	}

}
