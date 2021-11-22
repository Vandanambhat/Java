package com.xworkz.dp.dto;

public class CircusDTO {

	String ownerName;
	Float ticketPrice;
	Integer noOfAnimals;
	Integer noOfShows;
	Float durationOfShow;
	
	public CircusDTO() {
		
	}

	public CircusDTO(String ownerName, Float ticketPrice, Integer noOfAnimals, Integer noOfShows,
			Float durationOfShow) {
		super();
		this.ownerName = ownerName;
		this.ticketPrice = ticketPrice;
		this.noOfAnimals = noOfAnimals;
		this.noOfShows = noOfShows;
		this.durationOfShow = durationOfShow;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public Float getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(Float ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public Integer getNoOfAnimals() {
		return noOfAnimals;
	}

	public void setNoOfAnimals(Integer noOfAnimals) {
		this.noOfAnimals = noOfAnimals;
	}

	public Integer getNoOfShows() {
		return noOfShows;
	}

	public void setNoOfShows(Integer noOfShows) {
		this.noOfShows = noOfShows;
	}

	public Float getDurationOfShow() {
		return durationOfShow;
	}

	public void setDurationOfShow(Float durationOfShow) {
		this.durationOfShow = durationOfShow;
	}
	
}
