package com.xworkz.interfaces.busRoute;

public class BusDTO {

	String id;
	String startPoint;
	String destination;
	String driverName;
	
	public BusDTO() {
		System.out.println("Invoked busDTO");
	}

	public BusDTO(String id, String startPoint, String destination, String driverName) {
		super();
		System.out.println("Invoked parameterized busDTO");
		this.id = id;
		this.startPoint = startPoint;
		this.destination = destination;
		this.driverName = driverName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getStartPoint() {
		return startPoint;
	}

	public void setStartPoint(String startPoint) {
		this.startPoint = startPoint;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	
}
