package com.xworkz.crud.waterfall.addWaterFall;

public class AddWaterFall {

	private String place;
	private String[] fallsName = new String[5];
	private int count = 0;

	public AddWaterFall() {
		this("SHIVAMOGGA");
		System.out.println("Invoked no arg contructor");
	}

	public AddWaterFall(String place) {
		this.place = place;
		System.out.println("Invoked parameterized constructor");
	}

	public String getPlace() {
		return place;
	}

	public void addWaterFalls(String name) {
		// System.out.println("Brand name is :".concat(names));
		if (count <= 4) {
			fallsName[count] = name;
			count++;
		}
	}

	public void displayWaterFalls() {
		for (int water = 0; water < fallsName.length; water++) {
			String waterFalls = this.fallsName[water];
			System.out.println(waterFalls);
		}
	}
}
