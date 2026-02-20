package com.oops.abstracion;

class Phonepe implements Payment {

	void method1() {
		System.out.println("method1 called !!");
	}

	@Override
	public void pay() {
		System.out.println("Payment done through Phonepe !!");
	}
}

class GooglePay implements Payment {

	@Override
	public void pay() {
		System.out.println("Payment done through Google Pe !!");
	}

}

class AmazonPay implements Payment {
	@Override
	public void pay() {
		System.out.println("Payment done through Amazon  !!");
	}

}

public class TestDemoIn1 {

	public static void main(String[] args) {

//		While accessing interface methods, 
//		we should use interface as a reference and class should be an object.
//		The below process will considered as a  Abstraction with Up-casting.
		Payment pp = new Phonepe();
		pp.pay();
//		pp.method1();//The method method1() is undefined for the type Payment

		
		Payment gp = new GooglePay();
		gp.pay();
	}

}
