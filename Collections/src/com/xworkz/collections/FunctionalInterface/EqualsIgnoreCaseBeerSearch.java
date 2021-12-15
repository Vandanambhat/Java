package com.xworkz.collections.FunctionalInterface;

public class EqualsIgnoreCaseBeerSearch implements BeerSearch {

	@Override
	public boolean expressions(String arg1, String arg2) {
		System.out.println("Invoked Expression for equalsIgnoreCase");
		return arg1.equalsIgnoreCase(arg2);
	}

}
