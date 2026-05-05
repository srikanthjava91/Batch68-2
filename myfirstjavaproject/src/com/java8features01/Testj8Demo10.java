package com.java8features01;

interface In10 {
	void play();

	void show();
}

public class Testj8Demo10 {

	public static void main(String[] args) {

		In10 i = new In10() {
			@Override
			public void play() {
				System.out.println("Play Cricket !");
			}

			@Override
			public void show() {
				System.out.println("Show method called ");

			}
		};

		i.play();
		i.show();

	}

}
