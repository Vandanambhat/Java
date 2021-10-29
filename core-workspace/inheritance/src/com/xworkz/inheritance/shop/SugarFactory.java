package com.xworkz.inheritance.shop;

public class SugarFactory extends Factory {

	private String name;
	private int since;

	public SugarFactory() {
		super(1947);
	}

	public SugarFactory(int since) {
		super();
		System.out.println("Invoked parameterized SugarFActory constr");
		this.since = since;
		System.out.println(this.since);
	}

}
