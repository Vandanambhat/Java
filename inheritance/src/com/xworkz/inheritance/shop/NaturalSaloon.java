package com.xworkz.inheritance.shop;

public class NaturalSaloon extends Saloon {

	public String name;
	public int noOfHajamas;

	public NaturalSaloon() {
//		super("Rakesh",8);
		this("Sharan", 26);
		System.out.println("Invoked Natural Saloon no-arg Constructor");
	}

	public NaturalSaloon(String name, int noOfHajamas) {
		super();
		System.out.println("Invoked Natural Saloon constructor");
		this.name = name;
		this.noOfHajamas = noOfHajamas;
	}
}
