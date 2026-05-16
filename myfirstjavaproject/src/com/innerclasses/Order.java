package com.innerclasses;

public class Order {

	OrderStatus status;

	public Order(OrderStatus status) {
		this.status = status;
	}

	public void printStatus() {
		System.out.println("Order is currently: " + status);
	}

	public static void main(String[] args) {
		System.out.println("main method started ");
		Order o = new Order(OrderStatus.CANCELLED);
		o.printStatus();
	}
}
