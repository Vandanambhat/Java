package com.xworkz.interfaces.airport_DTO_DAO;



public class AirportTakeOff {

	private AirportDAO dao;
	private AirportDTO[] airDTO = new AirportDTO[10];
	private int count = 0;

	public AirportTakeOff(AirportDAO dao) {
		super();
		System.out.println("Invoked para Bird Flying");
		this.dao = dao;
	}

	public AirportTakeOff(AirportDAO dao, AirportDTO[] airDTO, int count) {
		super();
		System.out.println("Invoked para AirportTakeOff");
		this.dao = dao;
		this.airDTO = airDTO;
		this.count = count;
	}

	public AirportDAO getDao() {
		return dao;
	}

	public void saveAir(AirportDTO adto) {
		if (adto != null) {
			System.out.println("Invoked save Air");
			this.airDTO[count++] = adto;
		} else {
			System.out.println("Loo yako null ge point maadthidiya");
		}
	}

	public AirportDTO findAirportByName(AirportDTO adto) {
		System.out.println("Invoked find Airport By Name");
		for (int i = 0; i < airDTO.length; i++) {

			AirportDTO cartRef = this.airDTO[count];
			if (cartRef != null) {
				String birdName = cartRef.getName();
				if (birdName.equals(adto)) {
					System.out.println("Passed Name is found");
				} else {
					System.out.println("Passed name is not found");
				}

			}
		}
		return adto;
	}

	public void displayCart() {
		for (int i = 0; i < airDTO.length; i++) {
			AirportDTO cartRef = this.airDTO[count];
			if (cartRef != null) {
				System.out.println(cartRef.getId());
				System.out.println(cartRef.getLocation());
				System.out.println(cartRef.getName());
				System.out.println(cartRef.getType());
			}
		}

	}

}
