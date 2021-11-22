package com.xworkz.crud.rockets.rocketAdd;

public class AddRockets {
	private String rocketName;
	private String[] rocketname = new String[5];
	private int count = 0;

	public AddRockets() {
		this("ISRO Rockets");
		System.out.println("Invoked no arg contructor");
	}

	public AddRockets(String rocketName) {
		this.rocketName = rocketName;
		System.out.println("Invoked parameterized constructor");
	}

	public String getRocketName() {
		return rocketName;
	}

	public void addRestaurents(String names) {
		// System.out.println("Brand name is :".concat(names));
		if (count <= 4) {
			this.rocketname[this.count] = names;
			count++;
		}
	}

	public void displayRestaurents() {
		for (int res = 0; res < rocketname.length; res++) {
			String restaurent = this.rocketname[res];
			System.out.println(restaurent);
		}
	}
}
