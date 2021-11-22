package com.xworkz.crud.resort.resortAdd;

public class AddResort {
	private String location;
	private String[] resortName = new String[5];
	private int count = 0;

	public AddResort() {
		this("Island Countries");
		System.out.println("Invoked no arg contructor");
	}

	public AddResort(String islandCountry) {
		this.location = islandCountry;
		System.out.println("Invoked parameterized constructor");
	}

	public String getLocation() {
		return location;
	}

	public void addResort(String resort) {

		if (count <= 4) {
			this.resortName[this.count] = resort;
			count++;
		}
	}

	public void displayResort() {
		for (int res = 0; res < resortName.length; res++) {
			String resort = this.resortName[res];
			System.out.println(resort);
		}

	}
}
