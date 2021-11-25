package com.xworkz.interfaces.busRoute;

public class ArrayBusDAO implements BusDAO{

	private BusDTO[] dtos = new BusDTO[10];
	private int increment = 0;

	public boolean save(BusDTO busDTO) {
		System.out.println("Invoked Save");
		if (busDTO != null) {
			this.dtos[increment++] = busDTO;
		} else {
			System.out.println("Loo yakla, null ede kano");
		}
		return false;
	}

	public BusDTO findByDriverName(String driverName) {

		System.out.println("Invoked find By Name");
		for (int i = 0; i < dtos.length; i++) {

			BusDTO cartRef = this.dtos[increment];
			if (cartRef != null) {
				String dName = cartRef.getDriverName();
				if (dName.equals(driverName)) {
					System.out.println("Passed BusDTO Name is found");
				} else {
					System.out.println("Passed BusDTO name is not found");
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
				System.out.println(cartRef.getId());
				System.out.println(cartRef.getStartPoint());
				System.out.println(cartRef.getDestination());
				System.out.println(cartRef.getDriverName());
			}
		}
	}

}
