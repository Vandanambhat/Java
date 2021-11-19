package com.java.interfaces.amazon_DTO_DAO;

public class AmazonBusiness {

	private AmazonCartDAO dao;
	private CartDTO[] cartDTO = new CartDTO[10];
	private int count = 0;

	public AmazonBusiness(AmazonCartDAO dao) {
		super();
		System.out.println("Invoked Amazon Business");
		this.dao=dao;
		
	}

	public AmazonBusiness(AmazonCartDAO dao, CartDTO[] cartDTO) {
		super();
		this.dao = dao;
		this.cartDTO = cartDTO;
	}

	public AmazonCartDAO getDao() {
		return dao;
	}

	public void saveCart(CartDTO cdto) {
		if (cdto != null) {
			System.out.println("Invoked Save Cart");
			this.cartDTO[count++] = cdto;
		} else {
			System.out.println("Loo yako null ge point maadthidiya");
		}
	}

	public CartDTO findCartByName(CartDTO cdto) {
		System.out.println("Invoked find Cart By Name");
		for (int i = 0; i < cartDTO.length; i++) {
			
			CartDTO cartRef = this.cartDTO[count];
			if (cartRef != null) {
				String cartName = cartRef.getName();
				if (cartName.equals(cdto)) {
					System.out.println("Passed Name is found");
				} else {
					System.out.println("Passed name is not found");
				}

			}
		}
		return cdto;
	}

	public void displayCart() {
		for (int i = 0; i < cartDTO.length; i++) {
			CartDTO cartRef = this.cartDTO[count];
			if (cartRef != null) {
				System.out.println(cartRef.getName());
				System.out.println(cartRef.getQuantity());
				System.out.println(cartRef.getPrice());
				System.out.println(cartRef.getItems());
			}
		}

	}
}
