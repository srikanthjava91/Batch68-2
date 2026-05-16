package com.innerclasses;

public class State {
	private String stateName;

	public State(String stateName) {
		this.stateName = stateName;
	}

	// Member Inner Class
	public class District {
		private String districtName;

		public District(String districtName) {
			this.districtName = districtName;
		}

		public void showDetails() {
			System.out.println("State: " + stateName + ", District: " + districtName);
		}
	}

	public static void main(String[] args) {
		System.out.println("main method started ");
		State state = new State("Telangana");

		System.out.println(state.stateName);

		State.District district = state.new District("Hyderabad");
		district.showDetails();
	}
}
