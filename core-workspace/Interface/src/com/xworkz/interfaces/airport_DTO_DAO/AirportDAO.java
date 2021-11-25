package com.xworkz.interfaces.airport_DTO_DAO;

public interface AirportDAO {

	boolean save(AirportDTO airDTO);

	AirportDTO findByName(String name);

	void displayAllCartDetails();
}
