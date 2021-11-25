package com.xworkz.interfaces.airport_DTO_DAO;


public class AirportScanner {

	public static void main(String[] args) {
		AirportDTO dtosRef = new AirportDTO("FH9852", "Vandana", "Bangaluru", "National Airport");

		AirportDAO daosRef = new ArrayAirportDAO();

		AirportTakeOff business = new AirportTakeOff(daosRef);
		business.saveAir(dtosRef);
		business.findAirportByName(dtosRef);
		business.displayCart();
	}

}
