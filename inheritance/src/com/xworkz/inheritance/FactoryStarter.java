package com.xworkz.inheritance;

import com.xworkz.inheritance.shop.Factory;
import com.xworkz.inheritance.shop.SugarFactory;

public class FactoryStarter{

	public static void main(String[] args) {

		SugarFactory sugarFactory=new SugarFactory();
		sugarFactory=new SugarFactory(2021);
		
		Factory factory=new Factory(2010);
		factory=new SugarFactory();
		factory=new SugarFactory(1888);
 	}

}
