package com.xworkz.inheritance.shop;

public class Factory extends Object {

	private String name;
	private int since;

	public Factory() {
		super();
//		this(1998);
//		super(2021);The constructor Object(int) is undefined
		System.out.println("Invoked no-arg Factory constr");
	}

	public Factory(int since) {
		System.out.println("Invoked parameterized Factory constr");
		this.since = since;
		System.out.println(this.since);
	}

}
