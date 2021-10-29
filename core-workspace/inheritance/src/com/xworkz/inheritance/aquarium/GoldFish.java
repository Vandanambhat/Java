package com.xworkz.inheritance.aquarium;

public class GoldFish extends SharkFish {

	public String color;
	public String size;

	public GoldFish() {
		this("Orange", "small");
		System.out.println("Invoked GoldFish no-agr constr");
	}

	public GoldFish(String color, String size) {
		super();
		System.out.println("Invoked paramerized GoldFish constr");
		this.color = color;
		this.size = size;
	}

}
