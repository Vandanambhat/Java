package com.xworkz.crud.resort;

import com.xworkz.crud.resort.resortAdd.AddResort;

public class ResortStarter {

	public static void main(String[] args) {
		AddResort resName = new AddResort();
		String rn = resName.getLocation();
		System.out.println(rn);
		resName.addResort("Eagle Ridge Resort");
		resName.addResort("Eagle Ridge Resort");
		resName.addResort("Radiant Resort");
		resName.addResort("Capital Club Resort");
		resName.addResort("The Lake Side Resort");
		resName.displayResort();

	}

}
