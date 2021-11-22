package com.xworkz.crud.restaurant;

import com.xworkz.crud.restaurant.restaurantAdd.AddRestaurants;

public class RestaurantStarter {

	public static void main(String[] args) {
		AddRestaurants rest = new AddRestaurants();
		String water = rest.getLocation();
		System.out.println(water);
		rest.addRestaurents("Priya family bar and restaurant");
		rest.addRestaurents("Coastal restaurant");
		rest.addRestaurents("Aishwarya restaurant");
		rest.addRestaurents("Unmol Restaurant");
		rest.addRestaurents("Nisarga family and restaurants");
		rest.displayRestaurents();

	}

}
