package com.xworkz.crud;

import com.xworkz.crud.addBeachNames.AddBeachNames;

class CrudStarter {

	public static void main(String[] args) {

		AddBeachNames beach = new AddBeachNames();
		String countryName = beach.getCountry();
		System.out.println(countryName);
//String[] countryn=beach.getBeachNames();
//System.out.println(country);
		beach.addBeachNames("Om Beach");
		beach.addBeachNames("Malpe Beach");
		beach.addBeachNames("NITK Beach");
		beach.addBeachNames("Baaga Beach");
		beach.addBeachNames("Panambur Beach");
		beach.addBeachNames("Maravanthe Beach");
		beach.displayBeachNames();

	}

}
