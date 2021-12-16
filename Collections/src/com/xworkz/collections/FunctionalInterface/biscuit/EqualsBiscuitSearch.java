package com.xworkz.collections.FunctionalInterface.biscuit;

public class EqualsBiscuitSearch implements BiscuitSearch {

	@Override
	public boolean expressions(String arg1, String arg2) {
		System.out.println("Invoked Expression for equals");
		return arg1.equals(arg2);
	}

}
