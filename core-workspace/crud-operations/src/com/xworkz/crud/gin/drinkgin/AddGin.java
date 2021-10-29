package com.xworkz.crud.gin.drinkgin;

public class AddGin {
	private String name;
	private String[] brandName = new String[5];
	private int count = 0;

	public AddGin() {
		this("Gin");
		System.out.println("Invoked no arg contructor");
	}

	public AddGin(String name) {
		this.name = name;
		System.out.println("Invoked parameterized constructor");
	}

	public String getName() {
		return name;
	}

	public void displayGin() {
		for (int gin = 0; gin < brandName.length; gin++) {
			String gins = this.brandName[gin];
			System.out.println(gins);
		}
	}

	public void addBrandNames(String names) {
		// System.out.println("Brand name is :".concat(names));
		if (count <= 4) {
			brandName[count] = names;
			count++;
		}
	}
}
