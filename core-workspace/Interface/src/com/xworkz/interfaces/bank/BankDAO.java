package com.xworkz.interfaces.bank;

public interface BankDAO {

	boolean save(BankDTO airDTO);

	BankDTO findByName(String name);

	void displayAllCartDetails();

}
