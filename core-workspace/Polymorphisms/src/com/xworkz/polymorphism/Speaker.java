package com.xworkz.polymorphism;

public class Speaker {

	public Speaker() {
		System.out.println("Invoked no-arg Speaker");
	}

	@Override//It is also called as run time polymorphism
	protected void finalize() throws Throwable {
		System.out.println("Invoked protected finalize");
		super.finalize();
	}

	public void sound() {
		System.out.println("Invoked sound");
	}
}
/*
 * Overloading is called as compile time polymorphism
 * because the compiler will decide which method should be called
 */