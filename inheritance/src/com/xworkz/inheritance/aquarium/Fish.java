package com.xworkz.inheritance.aquarium;

public class Fish {

	public String region;
	public boolean alive;// true=alive

	public Fish() {
		this("Kaveri", true);
		System.out.println("Invoked Fish no-arg Constr");
	}

	public Fish(String region, boolean alive) {
		super();
		System.out.println("Invoked Fish parameterized costr");
		this.region = region;
		this.alive = alive;
	}
}
