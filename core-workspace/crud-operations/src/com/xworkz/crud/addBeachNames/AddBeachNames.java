package com.xworkz.crud.addBeachNames;

public class AddBeachNames {

	@SuppressWarnings("unused")
	private String country;
	private String[] beachNames = new String[5];
	private int count = 0;

	public AddBeachNames() {
		this("INDIA");
		System.out.println("Invoked no arg contructor");
	}

	public AddBeachNames(String country) {
		this.country = country;
		System.out.println("Invoked parameterized contructor");
	}

//	public String getBeachNames() {
//		return beachNames[0];
//	}
	public String getCountry() {
		return country;
	}

	public void addBeachNames(String name) {
		System.out.println("Invoked add Beach Names");
		System.out.println("Beach name is :".concat(name));
		if (count < 5) {// beachNames[0]=name;
			this.beachNames[this.count] = name;
			this.count++;
		} else {
			System.err.println("The array is full, you can't add further elements");
		}
	}

	public void displayBeachNames() {
		for (int vada = 0; vada < beachNames.length; vada++) {
			String Vade = this.beachNames[vada];
			System.out.println(Vade);
		}
	}
}
