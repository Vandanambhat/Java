package com.xworkz.dp.dto;

public class LawyerDTO {

	private String name;
	private String qualification;
	private Float experience;
	private String gender;
	private Integer age;
	private String courtType;
	private Integer casesWon;
	private Integer casesLost;

	public LawyerDTO() {
		System.out.println("Invoked LawyerDTO no-arg Constr");
	}

	public LawyerDTO(String name, String qualification, float f, String gender, int i, String courtType,
			int j, int k) {
		super();
		this.name = name;
		this.qualification = qualification;
		this.experience = f;
		this.gender = gender;
		this.age = i;
		this.courtType = courtType;
		this.casesWon = j;
		this.casesLost = k;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public Float getExperience() {
		return experience;
	}

	public void setExperience(Float experience) {
		this.experience = experience;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getCourtType() {
		return courtType;
	}

	public void setCourtType(String courtType) {
		this.courtType = courtType;
	}

	public Integer getCasesWon() {
		return casesWon;
	}

	public void setCasesWon(Integer casesWon) {
		this.casesWon = casesWon;
	}

	public Integer getCasesLost() {
		return casesLost;
	}

	public void setCasesLost(Integer casesLost) {
		this.casesLost = casesLost;
	}

}
