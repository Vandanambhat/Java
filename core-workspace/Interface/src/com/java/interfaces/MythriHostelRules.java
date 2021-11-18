package com.java.interfaces;

public class MythriHostelRules implements HostelRules,VisitingRule {

	@Override
	public int inTime() {
		System.out.println("Invoked inTime");
		return 0;
	}

	public int breakFastTime() {
		System.out.println("Invoked breakFastTime");
		return 0;
		
	}
	
	public String visitingDay() {
		System.out.println("Invoked visitingDay");
		return  "mon";
	}
	
}
