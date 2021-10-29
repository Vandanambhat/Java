package com.xworkz.dp.dto;

public class BusDriverDTO {

	private String busColor;
	private float salary;
	private float height;
	private int noOfPassengers;
	
	public BusDriverDTO()
	{
		System.out.println("Invoked no-argument constructor");
	}

	public BusDriverDTO(String busColor, float salary, float height, int noOfPassengers) {
		super();
		this.busColor = busColor;
		this.salary = salary;
		this.height = height;
		this.noOfPassengers = noOfPassengers;
	}

	public String getBusColor() {
		return busColor;
	}

	public void setBusColor(String busColor) {
		this.busColor = busColor;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public int getNoOfPassengers() {
		return noOfPassengers;
	}

	public void setNoOfPassengers(int noOfPassengers) {
		this.noOfPassengers = noOfPassengers;
	}
}
