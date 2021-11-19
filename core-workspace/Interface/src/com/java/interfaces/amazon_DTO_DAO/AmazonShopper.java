package com.java.interfaces.amazon_DTO_DAO;

public class AmazonShopper {

	public static void main(String[] args) {

		CartDTO dtosRef=new CartDTO("Cloths", 10, 1050f, "Pant, Top, Kurtha");
		AmazonCartDAO daosRef = new ArrayAmazonCartDAO();
		
		AmazonBusiness business= new AmazonBusiness(daosRef);
		business.saveCart(dtosRef);
		business.findCartByName(dtosRef);
		business.displayCart();
	}

}
