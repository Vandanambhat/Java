package com.xworkz.interfaces.birds_DTO_DAO;

public class BirdScanner {

	public static void main(String[] args) {
		
		BusDTO dtosRef = new BusDTO("TD#45", "hybrid", 3, "shimoga", false);

		BirdDAO daosRef = new ArrayBirdDAO();

		BirdFlying business = new BirdFlying(daosRef);
		business.saveCart(dtosRef);
		business.findCartByName(dtosRef);
		business.displayCart();
	}

}
