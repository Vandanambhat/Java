package com.xworkz.crud.coffee;

import com.xworkz.crud.coffee.updateCoffee.AddUpdateDeleteCoffee;

public class CoffeeStarter {

	public static void main(String[] args) {
		AddUpdateDeleteCoffee coffee = new AddUpdateDeleteCoffee();
		coffee.addCoffeeNames("Cold coffee");// 1
		coffee.addCoffeeNames("hot coffee");// 2
		coffee.addCoffeeNames("coffee 1");// 3
		coffee.addCoffeeNames("coffee 2");// 4
		coffee.addCoffeeNames("coffee 3");// 5
		coffee.displayCoffee();

		coffee.deleteCoffee(4);
		coffee.updateCoffee(3, "americano");

		String[] array = coffee.getCoffeeNames();

		for (int i = 0; i < array.length; i++) {
			System.out.println(i);
			System.out.println(array[i]);
		}

	}

}
