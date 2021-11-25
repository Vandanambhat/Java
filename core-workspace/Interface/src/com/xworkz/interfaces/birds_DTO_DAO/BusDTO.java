package com.xworkz.interfaces.birds_DTO_DAO;

public class BusDTO {

	String id;
	String breed;
	int age;
	String origin;
	boolean canFly;

	public BusDTO() {
		System.out.println("Invoked no-arg BirdDTO");
	}

	public BusDTO(String id, String breed, int age, String origin, boolean canFly) {
		super();
		System.out.println("Invoked parameterized BirdDTO");
		this.id = id;
		this.breed = breed;
		this.age = age;
		this.origin = origin;
		this.canFly = canFly;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public boolean isCanFly() {
		return canFly;
	}

	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}

}
