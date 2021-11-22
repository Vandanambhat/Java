package com.xworkz.dp.dto;

public class MilkCanDTO {

	private Float quantity;
	private String shapeOfCan;
	private String qualityOfCan;
	private String colorOfCan;
	private Float priceOfCan;

	public MilkCanDTO() {
		System.out.println("Invoked no-arg constructor");
	}

	public MilkCanDTO(Float quantity, String shapeOfCan, String qualityOfCan, String colorOfCan, Float priceOfCan) {
		super();
		System.out.println("Invoked parameterized constructor");
		this.quantity = quantity;
		this.shapeOfCan = shapeOfCan;
		this.qualityOfCan = qualityOfCan;
		this.colorOfCan = colorOfCan;
		this.priceOfCan = priceOfCan;
	}

	public Float getQuantity() {
		return quantity;
	}

	public void setQuantity(Float quantity) {
		this.quantity = quantity;
	}

	public String getShapeOfCan() {
		return shapeOfCan;
	}

	public void setShapeOfCan(String shapeOfCan) {
		this.shapeOfCan = shapeOfCan;
	}

	public String getQualityOfCan() {
		return qualityOfCan;
	}

	public void setQualityOfCan(String qualityOfCan) {
		this.qualityOfCan = qualityOfCan;
	}

	public String getColorOfCan() {
		return colorOfCan;
	}

	public void setColorOfCan(String colorOfCan) {
		this.colorOfCan = colorOfCan;
	}

	public Float getPriceOfCan() {
		return priceOfCan;
	}

	public void setPriceOfCan(Float priceOfCan) {
		this.priceOfCan = priceOfCan;
	}

}
