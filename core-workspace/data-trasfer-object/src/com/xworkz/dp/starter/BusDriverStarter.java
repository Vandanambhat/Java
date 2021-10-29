package com.xworkz.dp.starter;

import com.xworkz.dp.dto.BusDriverDTO;

public class BusDriverStarter {

	public static void main(String[] args) {

		// giving values using the getter and setter method
		BusDriverDTO busDTO = new BusDriverDTO();
		busDTO.setBusColor("India");
		busDTO.setHeight(5f);
		busDTO.setSalary(10000f);
		busDTO.setNoOfPassengers(20);

		// giving values using parameterized constructor
		BusDriverDTO busDTO1 = new BusDriverDTO("Red", 5.5f, 20000f, 30);
		BusDriverDTO busDTO2 = new BusDriverDTO("Red", 5.5f, 20000f, 30);
		BusDriverDTO busDTO3 = new BusDriverDTO("Red", 5.5f, 20000f, 30);
		BusDriverDTO busDTO4 = new BusDriverDTO("Red", 5.5f, 20000f, 30);

		BusDriverDTO[] ref = new BusDriverDTO[6];// array declaration and initialization
		ref[0] = busDTO;
		ref[1] = busDTO1;
		ref[2] = busDTO2;
		ref[3] = busDTO4;
		ref[4] = busDTO3;
		// iterations for printing the array values
		for (int pataki = 0; pataki < ref.length; pataki++) {

			// System.out.println(ref[pataki]);prints the null values for ArmyDTO[] ref =
			// new ArmyDTO[6];

			BusDriverDTO newRef = ref[pataki];
			
			if (newRef != null) {
				System.out.println(newRef.getBusColor());
				System.out.println(newRef.getHeight());
				System.out.println(newRef.getSalary());
				System.out.println(newRef.getNoOfPassengers());
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			}
		}

	}

}
