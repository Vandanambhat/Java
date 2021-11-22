package com.xworkz.interfaces.bridge.hospital;

public class Hospital {

	String states;
	String name;
	String location;
	boolean govt;
	HospitalAdmitRule hospitalAdmitRule;
	HospitalDischargeRule hospitalDischargeRule;

	public Hospital() {
		System.out.println("Invoked Hospital");
	}

	public Hospital(String states, String name, String location, boolean govt, HospitalAdmitRule hospitalAdmitRule,
			HospitalDischargeRule hospitalDischargeRule) {
		super();
		this.states = states;
		this.name = name;
		this.location = location;
		this.govt = govt;
		this.hospitalAdmitRule = hospitalAdmitRule;
		this.hospitalDischargeRule = hospitalDischargeRule;
	}

	public void admitPatient() {
		System.out.println("Invoked admitPatient");
		if (hospitalAdmitRule != null) {

			String reg=this.hospitalAdmitRule.register();
			if(govt) {
				System.out.println("The hospital is Govt");
				//double advance=this.hospitalAdmitRule.payAdvance();
				boolean insurance=this.hospitalAdmitRule.validInsurance();
				if(insurance==true){
					System.out.println("No need pay advance fo rhospital");
				}
				else {
					System.out.println("Pay advance to hospital");
				}
			}
		}
	}

	public void dischargePatient() {

		if(hospitalAdmitRule!=null) {
			System.out.println("Invoked dischargePatient");
			 double discountAmount=this.hospitalDischargeRule.discount();
			 
			 if(discountAmount<=10000) {
				 System.out.println("Hospital will give discount");
				 
			 }else {
				 System.err.println("Hospital ");
			 }
			 
			  boolean totalAmount=this.hospitalDischargeRule.payBill();
			  if(totalAmount) {
				  System.out.println("Pesent payed total Amount Hospital:".concat(String.valueOf(2000f)));
			  }else {
				  System.err.println("Pesent did not payed total amount to Hospital and he died");
			  }
		}else {
			System.err.println("Pesent not Discharge****");
		}
	}



}

