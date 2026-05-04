package com.collectionsframeworks.set;

import java.util.LinkedHashSet;
import java.util.Set;

//Q)Explain about HashMap or HashSet  Internal implementation ..? 
public class TestSetDemo1 {

	public static void main(String[] args) {

		Set<Integer> s1 = new LinkedHashSet<>();
		// 1 33 18 19 4 7 8 10 45 

		s1.add(7);//6th 
		s1.add(1);//1st  
		s1.add(8);//7th 
		s1.add(8);
		s1.add(19);//4th 
		s1.add(33);//1st
		s1.add(7);
		s1.add(45);//9th 
		s1.add(4);//5th 
		s1.add(18);//3rd 
		s1.add(10);//8th 

		System.out.println(s1);

	}

}
