package com.java.interfaces.amazon_DTO_DAO;

public interface AmazonCartDAO {

	boolean save(CartDTO cartDTO);

	CartDTO findByName(String name);

	void displayAllCartDetails();

}
