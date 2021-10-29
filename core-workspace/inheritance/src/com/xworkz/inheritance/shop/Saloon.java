package com.xworkz.inheritance.shop;

public class Saloon {

	public String name;
	public int noOfHajamas;

	public Saloon() {
		this("Vandana", 4);
		System.out.println("Invoked Saloon no-arg constructor");
	}

	public Saloon(String name, int noOfHajamas) {
		System.out.println("Innvoked parameterized Saloon Constructor");
		this.name = name;
		this.noOfHajamas = noOfHajamas;
	}
}
