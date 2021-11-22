package com.xworkz.crud.restaurant.restaurantAdd;

public class AddRestaurants {

	private String location;
	private String[] restname = new String[5];
	private int count = 0;

	public AddRestaurants() {
		this("BANGALORE");
		System.out.println("Invoked no arg contructor");
	}

	public AddRestaurants(String location) {
		this.location = location;
		System.out.println("Invoked parameterized constructor");
	}

	public String getLocation() {
		return location;
	}

	public void addRestaurents(String names) {
		// System.out.println("Brand name is :".concat(names));
		if (count <= 4) {
			this.restname[this.count] = names;
			count++;
		}
	}

	public void displayRestaurents() {
		for (int res = 0; res < restname.length; res++) {
			String restaurent = this.restname[res];
			System.out.println(restaurent);
		}
	}
}
