package com.xworkz.crud.island.IslandAdd;

public class AddIsland {
	private String islandCountry;
	private String[] islandName = new String[5];
	private int count = 0;

	public AddIsland() {
		this("Island Countries");
		System.out.println("Invoked no arg contructor");
	}

	public AddIsland(String islandCountry) {
		this.islandCountry = islandCountry;
		System.out.println("Invoked parameterized constructor");
	}

	public String getIslancountry() {
		return islandCountry;
	}

	public void addIsland(String names) {

		if (count <= 4) {
			this.islandName[this.count] = names;
			count++;
		}
	}

	public void displayisland() {
		for (int res = 0; res < islandName.length; res++) {
			String isLand = this.islandName[res];
			System.out.println(isLand);
		}

	}
}
