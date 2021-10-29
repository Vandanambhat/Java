package com.xworkz.dp.dao;

import com.xworkz.dp.dto.LawyerDTO;

import oracle.jrockit.jfr.tools.ConCatRepository;

public class LawyerDAO {

	private LawyerDTO[] lawyerDTOs = new LawyerDTO[10];
	private Integer majjige = 0;
	private Float maximum = 0f;

//	getter method for LawyerDTO array 
	public LawyerDTO[] getLawyerDTOs() {
		return lawyerDTOs;
	}

//	Create method : i.e., CRUD operation
	public void save(LawyerDTO dto) {
		if (dto != null) {
			this.lawyerDTOs[majjige++] = dto;
			System.out.println("Invoked save method");
		} else {
			System.out.println("Invoked save method");
		}
	}

//	overloading of the save method
	public void save(LawyerDTO dto, int index) {
		if (dto != null && index < this.lawyerDTOs.length && index >= 0) {
			this.lawyerDTOs[index] = dto;
			System.out.println("Invoked parameterized save method with dto and index");
		} else {
			System.out.println("Either the array is full or pointing to null");

		}
	}

//	delete method of CRUD operation
	public void delete(int index) {
		if (index >= 0 && lawyerDTOs != null && index < this.lawyerDTOs.length) {
			this.lawyerDTOs[index] = null;
			System.out.println("Invoked Delete Method");
		}
	}

	public boolean searchByName(String name) {
		for (int pikachu = 0; pikachu < lawyerDTOs.length; pikachu++) {
			System.out.println("Invoked searchByName method");
			LawyerDTO lawyerRef = this.lawyerDTOs[pikachu];
			if (lawyerRef != null) {
				System.out.println("array index is not null ".concat(String.valueOf(pikachu)));
				String ref = lawyerRef.getName();
				System.out.println("Name passed is : ".concat(ref));
				if (ref.equals(lawyerRef)) {
					System.out.println("Name is same");
					return true;
				}
			}
		}
		System.err.println("Name is not same");
		return false;
	}

	public boolean searchByCasesWon(int cases) {
		for (int myna = 0; myna < lawyerDTOs.length; myna++) {
			System.out.println("Invoked searchByCasesWon method");

			LawyerDTO lawyerRef = this.lawyerDTOs[myna];

			if (lawyerRef != null) {
				System.out.println("array index is not null ".concat(String.valueOf(myna)));

				Integer ref = lawyerRef.getCasesWon();

				System.out.println("Cases Won is : ".concat(String.valueOf(ref)));
				if (ref.equals(cases)) {
					System.out.println("Cases won are same");
					return true;
				}
			}
		}
		System.err.println("Cases won are not same");
		return false;
	}

	public int getExpByName(String name) {
		for (int eli = 0; eli < lawyerDTOs.length; eli++) {
			System.out.println("Invoked getExpByName method");

			LawyerDTO lawyerRef = this.lawyerDTOs[eli];

			if (lawyerRef != null) {
				System.out.println("array index is not null ".concat(String.valueOf(eli)));

				String ref = lawyerRef.getName();
				System.out.println("Name is :".concat(name));

				if (ref.equals(name)) {
					System.out.println(" Experience by name is found ");
					System.out.println("Experience of \t".concat(name).concat("is \t")
							.concat(String.valueOf(lawyerRef.getExperience())));
					return 0;
				}
			}
		}
		System.err.println("Name matching with experience is not found");
		return 1;
	}

	public String getQualificationByName(String name) {
		for (int chameli = 0; chameli < lawyerDTOs.length; chameli++) {
			System.out.println("Invoked getQualificationByName method");

			LawyerDTO lawyerRef = this.lawyerDTOs[chameli];

			if (lawyerRef != null) {
				System.out.println("array index is not null".concat(String.valueOf(chameli)));
				String ref = lawyerRef.getName();
				System.out.println("Name passed is : ".concat(ref));

				if (ref.equals(name)) {
					System.out.println("Qualification by Name is found");
					System.out.println("Qualification of \t".concat(name).concat("is \t")
							.concat(String.valueOf(lawyerRef.getQualification())));
					return name;
				}
			}
		}
		System.err.println("Name matching with qualification is not found");
		return null;

	}

//	private LawyerDTO[] lawyerDTOs = new LawyerDTO[10];
//	private Float maximum = 0f;
	public LawyerDTO getLawyerWithMaxExp() {
		for (int index = 0; index < lawyerDTOs.length; index++) {

			LawyerDTO lawyerRef = this.lawyerDTOs[index];
//			maximum < lawyerRef.getExperience() && 
			
			if (lawyerRef != null) {
				
				Float fig = lawyerRef.getExperience();
				if(maximum < fig ) {
					maximum = fig;
				}
			} else {
				System.err.println("lawyer pointing to null");
			}
		}
		System.out.println("Lawyer with maximum experience is :".concat(String.valueOf(maximum)));
		return null;

	}
}// end of LawyerDAO
