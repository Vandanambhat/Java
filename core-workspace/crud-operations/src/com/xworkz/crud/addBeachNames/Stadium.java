package com.xworkz.crud.addBeachNames;

public class Stadium {

	private String [] stadiumNames=new String[6];
	private int stadiumNo=0;
	
	
	public String[] getStadiumNames() {
		return stadiumNames;
	}
	
	public void addStadium(String name) {
		
		if(stadiumNo<this.stadiumNames.length) {
			
			this.stadiumNames[this.stadiumNo]=name;
			this.stadiumNo++;
			System.out.println("arg passed is :-->".concat(name));
		}
		else {
			System.err.println("Error : The array is full");
			
		}
		
	}
	public void deleteStadium(int no) {
		
		if(no>=0 && no<this.stadiumNames.length) {
			this.stadiumNames[no]=null;
			System.out.println("deleted index is ".concat(String.valueOf(no)));
			
		}
		else {
			System.err.println("Error : The given index value can't be deleted");
		}
	}
	public void updateStadiun(int vandu,String eradu) {
		if(vandu>=0 && vandu<this.stadiumNames.length) {
			
			this.stadiumNames[vandu]=eradu;
			System.out.println("The updated index value is ".concat(eradu));
		}
		else {
			System.err.println("not able to update index");
		}
	}
}
