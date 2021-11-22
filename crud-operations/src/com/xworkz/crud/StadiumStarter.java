package com.xworkz.crud;

import com.xworkz.crud.addBeachNames.Stadium;

public class StadiumStarter {

	public static void main(String[] args) {
	
		Stadium stadium=new Stadium();
		stadium.getStadiumNames();
		
		stadium.addStadium("vankhede");
		stadium.addStadium("chinnaswami");
		stadium.addStadium("edengarden");
		
		
		
		String[] array=stadium.getStadiumNames();
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		
	}
	
	

}
