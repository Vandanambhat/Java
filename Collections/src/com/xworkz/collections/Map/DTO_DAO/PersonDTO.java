package com.xworkz.collections.Map.DTO_DAO;

public class PersonDTO {

	private int id;
	private String name;
	private int age;
	private String email;
	
	public PersonDTO() {
		// TODO Auto-generated constructor stub
	}

	public PersonDTO(int id, String name, int age, String email) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.email = email;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

	@Override
	public String toString() {
		return "PersonDTO [id=" + id + ", name=" + name + ", age=" + age + ", email=" + email+ "]";
	}
	
	
}
