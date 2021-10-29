package com.xworkz.crud.chocolate;

import com.xworkz.crud.chocolate.brand.AddBrandName;

public class ChocolateFactory {

	public static void main(String[] args) {//		CRUD--->Create Read Update Delete
		
		AddBrandName brand=new AddBrandName();
		int cost=brand.getPrice();
		System.out.println(cost);
		brand.addBrandNames("Dairy Milk");
		brand.addBrandNames("Kit-Kat");
		brand.addBrandNames("LuvIt");
		brand.addBrandNames("Milky BAr");
		brand.addBrandNames("5-Star");
		brand.displayChocolate();

	}

}
