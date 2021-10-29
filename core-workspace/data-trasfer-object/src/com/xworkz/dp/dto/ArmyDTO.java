package com.xworkz.dp.dto;

public class ArmyDTO {

	private String country;
	private int noOfSoldiers;
	private int noOfTankers;
	private int noOfCarriers;
	private String major;

	public ArmyDTO() {
		System.out.println("Invoked No-arg Constructor");
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getNoOfSoldiers() {
		return noOfSoldiers;
	}

	public void setNoOfSoldiers(int noOfSoldiers) {
		this.noOfSoldiers = noOfSoldiers;
	}

	public int getNoOfTankers() {
		return noOfTankers;
	}

	public void setNoOfTankers(int noOfTankers) {
		this.noOfTankers = noOfTankers;
	}

	public int getNoOfCarriers() {
		return noOfCarriers;
	}

	public void setNoOfCarriers(int noOfCarriers) {
		this.noOfCarriers = noOfCarriers;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public ArmyDTO(String country, int noOfSoldiers, int noOfTankers, int noOfCarriers, String major) {
		super();
		this.country = country;
		this.noOfSoldiers = noOfSoldiers;
		this.noOfTankers = noOfTankers;
		this.noOfCarriers = noOfCarriers;
		this.major = major;
	}

}
