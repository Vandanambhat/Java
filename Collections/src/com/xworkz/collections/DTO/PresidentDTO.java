package com.xworkz.collections.DTO;

public class PresidentDTO {
	private int id;
	private String name;
	private int tenure;
	private String countryName;

	public PresidentDTO(int id, String name, int tenure, String countryName) {
		super();
		System.out.println("Invoked parameterized PresidentDTO constructor");
		this.id = id;
		this.name = name;
		this.tenure = tenure;
		this.countryName = countryName;
	}

	public PresidentDTO() {
		System.out.println("Invoked no-arg PresidentDTO constructor");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTenure() {
		return tenure;
	}

	public void setTenure(int tenure) {
		this.tenure = tenure;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	@Override
	public String toString() {
		return "PresidentDTO [id=" + id + ", name=" + name + ", tenure=" + tenure + ", countryName=" + countryName
				+ "]";
	}

}
