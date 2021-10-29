package com.xworkz.inheritance;

import com.xworkz.inheritance.shop.NaturalSaloon;
import com.xworkz.inheritance.shop.Saloon;

public class BiryaniStarter {

	public static void main(String[] args) {

		NaturalSaloon naturalSaloon = new NaturalSaloon();
		// naturalSaloon.name="kusuma";
		System.out.println(naturalSaloon.name);
		System.out.println(naturalSaloon.noOfHajamas);
		System.out.println("---------------------------");

		Saloon saloon = new Saloon();
//		saloon.name="Rakesh";
		System.out.println(saloon.name);
		System.out.println(saloon.noOfHajamas);
		System.out.println("---------------------------");

		Saloon saloon1 = new NaturalSaloon();
//		saloon1.name = "Squid Game";
//		saloon1.noOfHajamas = 456;
		System.out.println(saloon1.name);
		System.out.println(saloon1.noOfHajamas);
	}

}
