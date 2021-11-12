package com.xworkz.inheritance.device;

public class Ipod {
	
	private String modelNo;
	
	
	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}
	public String getModelNo() {
		return modelNo;
	}
	
		
	@Override
	public String toString() {
		System.out.println("Invoked toString");
		return "ipod";
	}

	@Override
	public int hashCode() {
		System.out.println("Invoked hashCode");
		return 100;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			System.out.println("good you are not passing null");
		}if(obj instanceof Ipod) {
			
			Ipod casted=(Ipod)obj;
			String checkWith=casted.getModelNo();
			
			if(this.modelNo.equals(checkWith)) {
				System.out.println("Model number found");
				return true;
			}
			else {
				System.err.println("model number miss match");
			}
			
		}
		else {
			System.err.println("tale elva null pass madata ediya ");
		}
		return false;
	}
	
	
}
