package com.xworkz.interfaces.airport_DTO_DAO;

public class ArrayAirportDAO implements AirportDAO{

	private AirportDTO[] dtos = new AirportDTO[10];
	private int increment = 0;
	
	@Override
	public boolean save(AirportDTO airDTO) {
		System.out.println("Invoked Save");
		if (airDTO != null) {
			this.dtos[increment++] = airDTO;
		} else {
			System.out.println("Loo yakla, null ede kano");
		}
		return false;
	}

	@Override
	public AirportDTO findByName(String name) {
		System.out.println("Invoked find By Name");
		for (int i = 0; i < dtos.length; i++) {

			AirportDTO cartRef = this.dtos[increment];
			if (cartRef != null) {
				String cartName = cartRef.getName();
				if (cartName.equals(name)) {
					System.out.println("Passed BirdDTO Name is found");
				} else {
					System.out.println("Passed BirdDTO name is not found");
				}

			}
		}
		return null;
	}

	@Override
	public void displayAllCartDetails() {
		System.out.println("Invoked display All Cart Details");
		for (int i = 0; i < dtos.length; i++) {
			AirportDTO cartRef = this.dtos[increment];
			if (cartRef != null) {
				System.out.println(cartRef.getId());
				System.out.println(cartRef.getLocation());
				System.out.println(cartRef.getName());
				System.out.println(cartRef.getType());
			}
		}
	}
	}
