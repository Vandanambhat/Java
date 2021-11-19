package com.java.interfaces.amazon_DTO_DAO;

public class ArrayAmazonCartDAO implements AmazonCartDAO {

	private CartDTO[] dtos = new CartDTO[10];
	private int increment = 0;

	public boolean save(CartDTO cartDTO) {
		System.out.println("Invoked Save");
		if (cartDTO != null) {
			this.dtos[increment++] = cartDTO;
		} else {
			System.out.println("Loo yakla, null ede kano");
		}
		return false;
	}

	public CartDTO findByName(String name) {
		System.out.println("Invoked find By Name");
		for (int i = 0; i < dtos.length; i++) {

			CartDTO cartRef = this.dtos[increment];
			if (cartRef != null) {
				String cartName = cartRef.getName();
				if (cartName.equals(name)) {
					System.out.println("Passed CartDTO Name is found");
				} else {
					System.out.println("Passed CartDTO name is not found");
				}

			}
		}
		return null;
	}

	public void displayAllCartDetails() {
		System.out.println("Invoked display All Cart Details");
		for (int i = 0; i < dtos.length; i++) {
			CartDTO cartRef = this.dtos[increment];
			if (cartRef != null) {
				System.out.println(cartRef.getName());
				System.out.println(cartRef.getQuantity());
				System.out.println(cartRef.getPrice());
				System.out.println(cartRef.getItems());
			}
		}
	}

}
