package com.xworkz.interfaces.busRoute;


public class BusTravel {

	private BusDAO dao;
	private BusDTO[] busDTO = new BusDTO[10];
	private int count = 0;

	public BusTravel(BusDAO dao) {
		super();
		System.out.println("Invoked para Bus Travel");
		this.dao = dao;
	}

	public BusTravel(BusDAO dao, BusDTO[] birdDTO, int count) {
		super();
		System.out.println("Invoked para Bus Travel");
		this.dao = dao;
		this.busDTO = birdDTO;
		this.count = count;
	}

	public BusDAO getDao() {
		return dao;
	}

	public void saveCart(BusDTO bdto) {
		if (bdto != null) {
			System.out.println("Invoked Save Bus");
			this.busDTO[count++] = bdto;
		} else {
			System.out.println("Loo yako null ge point maadthidiya");
		}
	}

	public BusDTO findBusByDriverName(BusDTO bdto) {
		System.out.println("Invoked find Bus By Driver Name");
		for (int i = 0; i < busDTO.length; i++) {

			BusDTO cartRef = this.busDTO[count];
			if (cartRef != null) {
				String driveName = cartRef.getDriverName();
				if (driveName.equals(bdto)) {
					System.out.println("Passed Name is found");
				} else {
					System.out.println("Passed name is not found");
				}

			}
		}
		return bdto;
	}

	public void displayCart() {
		for (int i = 0; i < busDTO.length; i++) {
			BusDTO cartRef = this.busDTO[count];
			if (cartRef != null) {
				System.out.println(cartRef.getId());
				System.out.println(cartRef.getStartPoint());
				System.out.println(cartRef.getDestination());
				System.out.println(cartRef.getDriverName());
			}
		}

	}

}
