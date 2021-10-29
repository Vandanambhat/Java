package com.xworkz.dp.dao;

import com.xworkz.dp.dto.DoctorDTO;

public class DoctorDAO {

	private DoctorDTO[] doc = new DoctorDTO[15];
	private int count = 0;

	public DoctorDTO[] getDoc() {
		return doc;
	}

	public void create(DoctorDTO dto) {
		if (doc != null) {
			this.doc[count++] = dto;
			System.out.println("Invoked create method with dto ");
		}
	}

	public void create(DoctorDTO age, int index) {
		if (age != null && index < doc.length && index >= 0) {
			this.doc[index] = age;
			System.out.println("Invoked parameterized create method with age and index");
		} else {
			System.out.println("Either the array is full or pointing to null");
		}
	}

	public int indexOccupied() {
		System.out.println("Index occupied is : ".concat(String.valueOf(count)));
		return this.count;
	}

	public boolean matchByDoctor(String specilization) {

		for (int basappa = 0; basappa < doc.length; basappa++) {
			DoctorDTO ref = this.doc[basappa];

			if (doc != null) {
				System.out.println("array index is not null ".concat(String.valueOf(basappa)));

				String spl = ref.getSpecialization();
				System.out.println("Specialization is : ".concat(spl));

				if (spl.equals(specilization)) {
					System.out.println("specialization is same");
					return true;
				}
//				else
//				{
//					System.out.println("specialization is not same");
//				}
			}
		}
		System.out.println("specialization is not same");
		return false;
	}
}// end of DoctorDAO
