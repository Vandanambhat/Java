package com.xworkz.dp.dto;

public class DoctorDTO {

	private String name;
	private String specialization;
	private String hospitalName;
	private String gender;
	private Float salary;
	private Integer age;

	public DoctorDTO() {
		System.out.println("Invoked no-arg COntructor");
	}

	public DoctorDTO(String name, String specialization, String hospitalName, String gender, Float salary,
			Integer age) {
		super();
		this.name = name;
		this.specialization = specialization;
		this.hospitalName = hospitalName;
		this.gender = gender;
		this.salary = salary;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Float getSalary() {
		return salary;
	}

	public void setSalary(Float salary) {
		this.salary = salary;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

}
