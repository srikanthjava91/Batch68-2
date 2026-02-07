package com.oops.encapsulation;

//DTO : Data Transfer Object 
//POJO : Plain Old Java Object
//Data Model
public class Student {

	private String sid;
	private String sname;
	private int age;

	public void setSid(String sid) {
		this.sid = "JFS - " + sid;
	}

	public String getSid() {
		return sid;
	}

	public void setSname(String sname) {
		this.sname = sname + "- Vcube";
	}

	public String getSname() {
		return sname;
	}

	public void setAge(int age) {
//		this.age = age;
		if (age >= 18 && age <= 60) {
			this.age = age;
		} else {
			System.out.println("Invalid age. Age must be between 18 and 60.");
		}
	}

	public int getAge() {
		return age;
	}

}
