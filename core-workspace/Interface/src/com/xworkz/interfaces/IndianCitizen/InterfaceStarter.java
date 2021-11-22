package com.java.interfaces.IndianCitizen;

public class InterfaceStarter {

	public static void main(String[] args) {

		
		IndianCitizen citi=new IndianCitizen();
		citi.validAge();
		citi.validAge('F', 20);
		citi.validId();
		citi.validInsurance();
		citi.validLicence();
		citi.licenseNo();
		
		VotingRule vote=new IndianCitizen();
		vote.validAge();
		vote.validId();
		
	}

}
