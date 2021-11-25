package com.xworkz.interfaces.busRoute;

public interface BusDAO {
	boolean save(BusDTO busDTO);

	BusDTO findByDriverName(String driverName);

	void displayAllCartDetails();
}
