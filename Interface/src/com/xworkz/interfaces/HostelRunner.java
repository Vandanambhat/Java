package com.xworkz.interfaces;

public class HostelRunner {

	public static void main(String[] args) {

		HostelRules hostelRules=new HostelRules() {
			
			@Override
			public int inTime() {
				return 0;
			}
		};
		hostelRules.inTime();
		
		HostelRules hostelRules1=new MythriHostelRules();
		hostelRules1.inTime();
		
		MythriHostelRules mythri=new MythriHostelRules();
		mythri.inTime();
		mythri.breakFastTime();
	}

}
