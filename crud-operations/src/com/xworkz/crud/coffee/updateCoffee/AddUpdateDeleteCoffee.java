package com.xworkz.crud.coffee.updateCoffee;

public class AddUpdateDeleteCoffee {
	private int price;
	private String[] coffeeNames = new String[5];
	private int count = 0;

	public AddUpdateDeleteCoffee() {
		this(20);
		System.out.println("Invoked no arg contructor");
	}

	public AddUpdateDeleteCoffee(int price) {
		this.price = price;
		System.out.println("Invoked parameterized contructor");
	}

	public String[] getCoffeeNames() {
		return coffeeNames;
	}

	public int getPrice() {
		return price;
	}

	public void addCoffeeNames(String coffee) {
		System.out.println("Invoked add cool drinks Names");
		System.out.println("Beach name is :".concat(coffee));

		if (count >= 0 && count < coffeeNames.length) {
			this.coffeeNames[this.count] = coffee;
			this.count++;
		} else {
			System.err.println("The array is full, you can't add further elements,limit".concat(String.valueOf(count)));
		}
	}

	public void deleteCoffee(int holige) {
		System.out.println("deleted cool drink is : ".concat(String.valueOf(holige)));
		if (holige >= 0 && holige < coffeeNames.length) {
			this.coffeeNames[holige] = null;
		}
	}

	public void updateCoffee(int jamoon, String newRef) {
		System.out.println("deleted cool drink is : ".concat(String.valueOf(jamoon)));
		if (jamoon >= 0 && jamoon < coffeeNames.length) {
			this.coffeeNames[jamoon] = newRef;
		}
	}

	public void displayCoffee() {
		for (int thuthuVada = 0; thuthuVada < coffeeNames.length; thuthuVada++) {
			String Vade = this.coffeeNames[thuthuVada];
			System.out.println(Vade);
		}
	}
}
