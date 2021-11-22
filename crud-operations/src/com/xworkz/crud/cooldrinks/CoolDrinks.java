package com.xworkz.crud.cooldrinks;

import com.xworkz.crud.cooldrinks.crud.AddUpdateDeleteCoolDrinks;

public class CoolDrinks {

	public static void main(String[] args) {

		AddUpdateDeleteCoolDrinks cool = new AddUpdateDeleteCoolDrinks();
		cool.addCoolDrinksNames("7-UP");// 1
		cool.addCoolDrinksNames("Slice");// 2
		cool.addCoolDrinksNames("Fruity");// 3
		cool.addCoolDrinksNames("Dew");// 4
		cool.addCoolDrinksNames("Maaza");// 5
		cool.addCoolDrinksNames("Appy");// 6
		cool.addCoolDrinksNames("Mirinda");// 7
		cool.displayCoolDrinks();

		cool.deleteCoolDrink(4);
		cool.updateCooldrinks(3, "Limka");

		String[] array = cool.getCoolDrinksNames();

		for (int i = 0; i < array.length; i++) {
			System.out.println(i);
			System.out.println(array[i]);
		}

	}

}
