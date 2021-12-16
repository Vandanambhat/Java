package com.xworkz.collections.FunctionalInterface.biscuit;

public class EqualsIgnoreCaseBiscuitSearch implements BiscuitSearch {

	@Override
	public boolean expressions(String arg1, String arg2) {
		System.out.println("Invoked Expression for equalsIgnoreCase");
		return arg1.equalsIgnoreCase(arg2);
	}

}
