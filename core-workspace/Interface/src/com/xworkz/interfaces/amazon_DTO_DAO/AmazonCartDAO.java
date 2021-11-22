package com.xworkz.interfaces.amazon_DTO_DAO;

public interface AmazonCartDAO {

	boolean save(CartDTO cartDTO);

	CartDTO findByName(String name);

	void displayAllCartDetails();

}
