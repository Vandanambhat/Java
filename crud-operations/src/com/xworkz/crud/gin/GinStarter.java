package com.xworkz.crud.gin;

import com.xworkz.crud.gin.drinkgin.AddGin;

public class GinStarter {

	public static void main(String[] args) {// CRUD--->Create Read Update Delete
		AddGin juice = new AddGin();
		String drinks = juice.getName();
		System.out.println(drinks);
		juice.addBrandNames("Imperial Blue");
		juice.addBrandNames("Bacardy");
		juice.addBrandNames("HM");
		juice.addBrandNames("KingFisher");
		juice.addBrandNames("Tuborg");
		juice.displayGin();

	}

}
