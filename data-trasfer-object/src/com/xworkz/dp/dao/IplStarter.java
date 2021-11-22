package com.xworkz.dp.dao;

import com.xworkz.dp.dto.IplDTO;

public class IplStarter {

	public static void main(String[] args) {

//		IplDTO dto = new IplDTO();// invoked no-arg constructor

		IplDAO dao = new IplDAO();
		dao.create(new IplDTO("KKR", 3, 24, "Vandana", "Trishul"));
		dao.create(new IplDTO("MI", 3, 24, "Rakesh", "Ayyappa"), 20);
		dao.create(new IplDTO("DC", 2, 23, "Saayi", "Mallikarjun"));

		dao.indexOccupied();// Index occupied is : 2
		dao.matchByName("SR");// Invoked matchByName

		IplDTO[] dtoref = dao.getIplDTOs();

		for (int i = 0; i < dtoref.length; i++) {
			IplDTO ref = dtoref[i];

			System.out.println("***************************************************");
			if (ref != null) {
				System.out.println(ref.getTeamName());
				System.out.println(ref.getNoOfTeams());
				System.out.println(ref.getTeamSize());
				System.out.println(ref.getOwnerName());
				System.out.println(ref.getSponsorName());
			} else {
				System.out.println("Either the array is full or pointing to null ".concat(String.valueOf(i)));
			}
		}

	}

}
