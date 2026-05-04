package com.collectionsframeworks.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestEmployee {

	public static void main(String[] args) {

		Employee e1 = new Employee(4, "Abhishek", 22, 500000.00);
		Employee e2 = new Employee(9, "Tilak", 25, 300000.00);
		Employee e3 = new Employee(8, "Jadeja", 34, 200000.00);
		Employee e4 = new Employee(18, "Kohli", 38, 1800000.00);
		Employee e5 = new Employee(45, "Rohit", 37, 4500000.00);

		List<Employee> list = new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);

		Comparator<Employee> c = new Comparator<Employee>()

		{
			@Override
			public int compare(Employee o1, Employee o2) {
				if (o1.salary < o2.salary) {
					return -1;
				} else if (o1.salary > o2.salary) {
					return 1;
				}

				return 0;
			}
		};

		Collections.sort(list, c);

		for (Employee emp : list) {
			System.out.println(emp);
		}

	}

}
