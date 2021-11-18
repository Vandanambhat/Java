package com.java.interfaces.bridge.hospital;

public class HospitalImplementation implements HospitalAdmitRule, HospitalDischargeRule {
//This class provides the implementation for the interfaces HospitalAdmitRule,HospitalDischargeRule 

	public boolean payBill() {
		System.out.println("Invoked payBill");
		return false;
	}

	public double discount() {
		System.out.println("Invoked discount");
		return 0;
	}

	public String register() {
		System.out.println("Invoked register");
		return null;
	}

	public double payAdvance() {
		System.out.println("Invoked payAdvance");
		return 0;
	}

	public boolean validInsurance() {
		System.out.println("Invoked validInsurance");
		return false;
	}

}
