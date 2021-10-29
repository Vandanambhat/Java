package com.xworkz.dp.starter;

import com.xworkz.dp.dto.BraceletDTO;

public class BraceletStarter {

	public static void main(String[] args) {
		// giving values using the getter and setter method
		BraceletDTO braceletDTO = new BraceletDTO();
		braceletDTO.setColor("GOLD");
		braceletDTO.setGemUsed(false);
		braceletDTO.setGifted(true);
		braceletDTO.setMaterial("Gold");
		braceletDTO.setPrice(3000.0f);

		// giving values using parameterized constructor
		BraceletDTO braceletDTO2 = new BraceletDTO("red", "silver", false, true, 2000.0f);
		BraceletDTO braceletDTO3 = new BraceletDTO("Orange", "silver", false, true, 200.0f);
		BraceletDTO braceletDTO4 = new BraceletDTO("White", "silver", false, true, 2000.0f);
		BraceletDTO braceletDTO5 = new BraceletDTO("blue8", "silver", false, true, 2000.0f);

		// array declaration and initialization
		BraceletDTO[] brace = new BraceletDTO[6];
		brace[0] = braceletDTO;
		brace[2] = braceletDTO2;
		brace[3] = braceletDTO3;
		brace[1] = braceletDTO4;
		brace[4] = braceletDTO5;
		for (int dotigala = 0; dotigala < brace.length; dotigala++) {
			// System.out.println(brace[dotigala]);gives all the null values

			BraceletDTO dto = brace[dotigala];
			if (dto != null) {
				System.out.println(dto.getColor());
				System.out.println(dto.getMaterial());
				System.out.println(dto.isGemUsed());
				System.out.println(dto.isGifted());
				System.out.println(dto.getPrice());
			} else {
				System.err.println("Index ".concat(String.valueOf(dotigala)).concat(" is pointing to null"));
			}
		}
	}

}
