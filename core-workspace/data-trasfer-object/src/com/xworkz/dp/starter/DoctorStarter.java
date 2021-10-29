package com.xworkz.dp.starter;

import com.xworkz.dp.dao.DoctorDAO;
import com.xworkz.dp.dto.DoctorDTO;

public class DoctorStarter {

	public static void main(String[] args) {

		DoctorDAO dao = new DoctorDAO();
		dao.create(new DoctorDTO("Rachana", "Gynocologist", "Appollo", "Female", 120000f, 28));
		dao.create(new DoctorDTO("Vandana", "Cardiologist", "Appollo", "Female", 300000f, 27));

		dao.create(new DoctorDTO("Shubha", "Pediatrist", "Meg ghann", "Female", 200000f, 29));
		dao.indexOccupied();
		dao.matchByDoctor("Cardiologist");

		DoctorDTO[] docRef = dao.getDoc();

		for (int moti = 0; moti < docRef.length; moti++) {

			DoctorDTO ref = docRef[moti];
			if (ref != null) {
				System.out.println(ref.getName());
				System.out.println(ref.getSpecialization());
				System.out.println(ref.getHospitalName());
				System.out.println(ref.getGender());
				System.out.println(ref.getSalary());
				System.out.println(ref.getAge());
				System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
			} else {
				System.out.println("Either the array is full or pointing to null".concat(String.valueOf(moti)));
			}
		}
	}

}
