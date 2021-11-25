package com.xworkz.interfaces.birds_DTO_DAO;

public interface BirdDAO {

	boolean save(BusDTO birdDTO);

	BusDTO findByName(String name);

	void displayAllCartDetails();
}
