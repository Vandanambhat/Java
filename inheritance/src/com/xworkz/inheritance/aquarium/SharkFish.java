package com.xworkz.inheritance.aquarium;

public class SharkFish extends Fish {
	public float height;
	public float weight;

	public SharkFish() {
		this(30f, 5.5f);
		System.out.println("Invoked SharkFish no-arg contr");
	}

	public SharkFish(float height, float weight) {
		super();
		System.out.println("Invoked SharkFish parameterized contr");
		this.height = height;
		this.weight = weight;
	}

}
