package com.xworkz.collections.Map.DTO_DAO;

public class AddressDTO {
	private int id;
	private int doorNo;
	private String street;
	private String city;
	private int pincode;

	public AddressDTO() {
		// TODO Auto-generated constructor stub
	}

	public AddressDTO(int id, int doorNo, String street, String city, int pincode) {
		super();
		this.id = id;
		this.doorNo = doorNo;
		this.street = street;
		this.city = city;
		this.pincode = pincode;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDoorNo() {
		return doorNo;
	}

	public void setDoorNo(int doorNo) {
		this.doorNo = doorNo;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

	@Override
	public String toString() {
		return "PersonDTO [id=" + id + ", doorNo=" + doorNo + ", street=" + street + ", city=" + city + ", pincode=" + pincode + "]";
	}

}
