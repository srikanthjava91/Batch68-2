package com.innerclasses;

public class University1 {
	void createCommittee() {
		String committeeName = "Tech Fest Committee";

		// Local Inner Class inside method
		class Committee {
			void show() {
				System.out.println("Committee: " + committeeName);
			}
		}

		Committee committee = new Committee();
		committee.show();
	}

	public static void main(String[] args) {
		University1 u = new University1();
		u.createCommittee();
	}
}
