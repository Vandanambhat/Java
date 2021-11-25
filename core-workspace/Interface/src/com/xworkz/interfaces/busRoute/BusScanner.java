package com.xworkz.interfaces.busRoute;



public class BusScanner {

	public static void main(String[] args) {

		BusDTO dtosRef = new BusDTO("FH9852", "Shimoga", "Bangaluru", "Narayanappa");

		BusDAO daosRef = new ArrayBusDAO();

		BusTravel business = new BusTravel(daosRef);
		business.saveCart(dtosRef);
		business.findBusByDriverName(dtosRef);
		business.displayCart();
	}
}

