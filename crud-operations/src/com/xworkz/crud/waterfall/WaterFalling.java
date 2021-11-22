package com.xworkz.crud.waterfall;

import com.xworkz.crud.waterfall.addWaterFall.AddWaterFall;

public class WaterFalling {

	public static void main(String[] args) {
		// CRUD--->Create Read Update Delete
		AddWaterFall waterfall = new AddWaterFall();
		String water = waterfall.getPlace();
		System.out.println(water);
		waterfall.addWaterFalls("Jog Falls");
		waterfall.addWaterFalls("Abbe Falls");
		waterfall.addWaterFalls("Niagara Falls");
		waterfall.addWaterFalls("Barachukki falls");
		waterfall.addWaterFalls("Muthyala Maduvu Falls");
		waterfall.displayWaterFalls();
	}

}
