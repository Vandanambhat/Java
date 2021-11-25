package com.xworkz.interfaces.birds_DTO_DAO;

public class ArrayBirdDAO implements BirdDAO {
	
	private BusDTO[] dtos = new BusDTO[10];
	private int increment = 0;

	public boolean save(BusDTO birdDTO) {
		System.out.println("Invoked Save");
		if (birdDTO != null) {
			this.dtos[increment++] = birdDTO;
		} else {
			System.out.println("Loo yakla, null ede kano");
		}
		return false;
	}

	public BusDTO findByName(String name) {

		System.out.println("Invoked find By Name");
		for (int i = 0; i < dtos.length; i++) {

			BusDTO cartRef = this.dtos[increment];
			if (cartRef != null) {
				String cartName = cartRef.getBreed();
				if (cartName.equals(name)) {
					System.out.println("Passed BirdDTO Name is found");
				} else {
					System.out.println("Passed BirdDTO name is not found");
				}

			}
		}
		return null;
	}

	public void displayAllCartDetails() {
		System.out.println("Invoked display All Cart Details");
		for (int i = 0; i < dtos.length; i++) {
			BusDTO cartRef = this.dtos[increment];
			if (cartRef != null) {
				System.out.println(cartRef.getAge());
				System.out.println(cartRef.getBreed());
				System.out.println(cartRef.getId());
				System.out.println(cartRef.getOrigin());
			}
		}
	}

}
