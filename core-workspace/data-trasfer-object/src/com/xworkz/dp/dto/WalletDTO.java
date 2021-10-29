package com.xworkz.dp.dto;

public class WalletDTO {
	private String companyName;
	private String material;
	private Integer totalCompartments;
	private Float price;
	private Integer coinCompartment;
	
	public WalletDTO() {
		System.out.println("Invoked no-arg constr");
	}

	public WalletDTO(String companyName, String material, Integer totalCompartments, Float price,
			Integer coinCompartment) {
		super();
		this.companyName = companyName;
		this.material = material;
		this.totalCompartments = totalCompartments;
		this.price = price;
		this.coinCompartment = coinCompartment;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public Integer getTotalCompartments() {
		return totalCompartments;
	}

	public void setTotalCompartments(Integer totalCompartments) {
		this.totalCompartments = totalCompartments;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Integer getCoinCompartment() {
		return coinCompartment;
	}

	public void setCoinCompartment(Integer coinCompartment) {
		this.coinCompartment = coinCompartment;
	}
	
}
