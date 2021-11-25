package com.xworkz.interfaces.birds_DTO_DAO;

public class BirdFlying {
	private BirdDAO dao;
	private BusDTO[] birdDTO = new BusDTO[10];
	private int count = 0;

	public BirdFlying(BirdDAO dao) {
		super();
		System.out.println("Invoked para Bird Flying");
		this.dao = dao;
	}

	public BirdFlying(BirdDAO dao, BusDTO[] birdDTO, int count) {
		super();
		System.out.println("Invoked para Bird Flying");
		this.dao = dao;
		this.birdDTO = birdDTO;
		this.count = count;
	}

	public BirdDAO getDao() {
		return dao;
	}

	public void saveCart(BusDTO bdto) {
		if (bdto != null) {
			System.out.println("Invoked Save bird");
			this.birdDTO[count++] = bdto;
		} else {
			System.out.println("Loo yako null ge point maadthidiya");
		}
	}

	public BusDTO findCartByName(BusDTO bdto) {
		System.out.println("Invoked find Cart By Name");
		for (int i = 0; i < birdDTO.length; i++) {

			BusDTO cartRef = this.birdDTO[count];
			if (cartRef != null) {
				String birdName = cartRef.getBreed();
				if (birdName.equals(bdto)) {
					System.out.println("Passed Name is found");
				} else {
					System.out.println("Passed name is not found");
				}

			}
		}
		return bdto;
	}

	public void displayCart() {
		for (int i = 0; i < birdDTO.length; i++) {
			BusDTO cartRef = this.birdDTO[count];
			if (cartRef != null) {
				System.out.println(cartRef.getAge());
				System.out.println(cartRef.getBreed());
				System.out.println(cartRef.getId());
				System.out.println(cartRef.getOrigin());
			}
		}

	}

}
