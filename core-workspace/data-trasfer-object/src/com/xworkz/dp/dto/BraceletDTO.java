package com.xworkz.dp.dto;

public class BraceletDTO {
	private String color;
	private String material;
	private boolean gifted;
	private boolean gemUsed;
	private float price;

	public BraceletDTO() {
		System.out.println("Invoked No-arg constructor");
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public boolean isGifted() {
		return gifted;
	}

	public void setGifted(boolean gifted) {
		this.gifted = gifted;
	}

	public boolean isGemUsed() {
		return gemUsed;
	}

	public void setGemUsed(boolean gemUsed) {
		this.gemUsed = gemUsed;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public BraceletDTO(String color, String material, boolean gifted, boolean gemUsed, float price) {
		this.color = color;
		this.material = material;
		this.gifted = gifted;
		this.gemUsed = gemUsed;
		this.price = price;
	}

}
