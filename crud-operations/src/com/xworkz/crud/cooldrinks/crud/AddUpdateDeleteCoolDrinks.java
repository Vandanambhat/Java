package com.xworkz.crud.cooldrinks.crud;

public class AddUpdateDeleteCoolDrinks {

	private String drinks;
	private String[] coolDrinksNames = new String[7];
	private int count = 0;

	public AddUpdateDeleteCoolDrinks() {
		this("DRINKS");
		System.out.println("Invoked no arg contructor");
	}

	public AddUpdateDeleteCoolDrinks(String drinks) {
		this.drinks = drinks;
		System.out.println("Invoked parameterized contructor");
	}

	public String[] getCoolDrinksNames() {
		return coolDrinksNames;
	}

	public String getDrinks() {
		return drinks;
	}

	public void addCoolDrinksNames(String coolDrink) {
		System.out.println("Invoked add cool drinks Names");
		System.out.println("Beach name is :".concat(coolDrink));

		if (count >= 0 && count < coolDrinksNames.length) {
			this.coolDrinksNames[this.count] = coolDrink;
			this.count++;
		} else {
			System.err.println("The array is full, you can't add further elements,limit".concat(String.valueOf(count)));
		}
	}

	public void deleteCoolDrink(int jilebi) {
		System.out.println("deleted cool drink is : ".concat(String.valueOf(jilebi)));
		if (jilebi >= 0 && jilebi < coolDrinksNames.length) {
			this.coolDrinksNames[jilebi] = null;
		}
	}

	public void updateCooldrinks(int jamoon, String newRef) {
		System.out.println("deleted cool drink is : ".concat(String.valueOf(jamoon)));
		if (jamoon >= 0 && jamoon < coolDrinksNames.length) {
			this.coolDrinksNames[jamoon] = newRef;
		}
	}

	public void displayCoolDrinks() {
		for (int thuthuVada = 0; thuthuVada < coolDrinksNames.length; thuthuVada++) {
			String Vade = this.coolDrinksNames[thuthuVada];
			System.out.println(Vade);
		}
	}
}
