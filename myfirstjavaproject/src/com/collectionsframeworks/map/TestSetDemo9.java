package com.collectionsframeworks.map;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Employee {
	int eid;
	String ename;

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + "]";
	}

	public Employee(int eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(eid, ename);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (!(obj instanceof Employee)) return false;
		Employee other = (Employee) obj;
		return eid == other.eid && Objects.equals(ename, other.ename);
	}

//	@Override
//	public int hashCode() {
//		int result = 17;
//		result = 31 * result + eid;
//		result = 31 * result + (ename == null ? 0 : ename.hashCode());
//		return result;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//
//		if (obj == null || getClass() != obj.getClass())
//			return false;
//
//		Employee other = (Employee) obj;
//
//		if (eid != other.eid)
//			return false;
//
//		if (ename == null) {
//			return other.ename == null;
//		} else {
//			return ename.equals(other.ename);
//		}
//	}

}

public class TestSetDemo9 {

	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Sneha");
		Employee e2 = new Employee(1, "Sneha");

		Set<Employee> ss = new HashSet<>();
		ss.add(e1);
		ss.add(e2);

		for (Employee emp : ss) {
			System.out.println(emp);
		}

		System.out.println(ss.size());

	}

}
