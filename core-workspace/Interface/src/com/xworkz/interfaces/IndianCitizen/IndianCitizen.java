package com.java.interfaces.IndianCitizen;

public class IndianCitizen implements VotingRule,TrafficRule,MarriageRule{

	private String name;
	//private Address address;
	
//	public Address {
//		
//	}
	public boolean validAge(char gender, int age) {
		
		if(gender=='F' && age>=18) {
			System.out.println("Eligible for marriage");
			
		}
		else {
			System.out.println("Not eligible for marriage, they are child");
		}
		return false;
	}

	public boolean validLicence() {
		
		return false;
	}

	public String licenseNo() {
		
		return null;
	}

	public boolean validInsurance() {
		
		return false;
	}

	public int validAge() {
		
		return 0;
	}

	public String validId() {
		
		return null;
	}
	
	

}
