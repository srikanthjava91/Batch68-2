package com.collectionsframeworks;

import java.util.ArrayList;
import java.util.List;

public class TestCollectionDemo12 {

	public static void main(String[] args) {

		List<Integer> team2 = new ArrayList<>();
		team2.add(5);
		team2.add(6);
		team2.add(7);
		team2.add(9);
		team2.add(8);
		
		team2.set(1, 10);
		System.out.println(team2);//5 10 7 9 8 

	}

}
