package com.collectionsframeworks.set;

public class Mobile implements Comparable<Mobile> {

	private String model;
	private String brand;
	private double price;
	private String color;

	@Override
	public String toString() {
		return "Mobile [model=" + model + ", brand=" + brand + ", price=" + price + ", color=" + color + "]";
	}

	public Mobile(String model, String brand, double price, String color) {
		super();
		this.model = model;
		this.brand = brand;
		this.price = price;
		this.color = color;
	}

	@Override
	public int compareTo(Mobile o) {
		
		return -this.color.compareTo(o.color);

//		if (this.price < o.price) {
//			return 1;
//		} else if (this.price > o.price) {
//			return -1;
//		}
//		return 0;
	}

}
