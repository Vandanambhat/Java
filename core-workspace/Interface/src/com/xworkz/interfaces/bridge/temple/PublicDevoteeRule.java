package com.xworkz.interfaces.bridge.temple;

public class PublicDevoteeRule implements DevoteeRule {

	public boolean slippersOff() {
		System.out.println("Invoked slippersOff");
		return true;
	}

	public boolean dontTakePhoto() {
		System.out.println("Invoked dontTakePhoto");
		return true;
	}

	public boolean maintainSilence() {
		System.out.println("Invoked maintainSilence");
		return true;
	}

}
