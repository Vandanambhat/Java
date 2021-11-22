package com.xworkz.dp.dao;

import com.xworkz.dp.dto.IplDTO;

public class IplDAO {

	private IplDTO[] iplDTOs = new IplDTO[30];
	private int soutu = 0;

	public void create(IplDTO dto) {// CRUD creating : inserting, saving ,adding, placeIt
		if (iplDTOs != null) {
			this.iplDTOs[this.soutu++] = dto;
//			System.out.println("Invoked create IplDTO :".concat(String.valueOf(dto.getNoOfTeams())));
//			System.out.println("Invoked create IplDTO :".concat(String.valueOf(dto.getOwnerName())));
		} else {
			System.out.println("Either the array is full or pointing to null");
		}
	}

	public IplDTO[] getIplDTOs() {
		return iplDTOs;
	}

	public void create(IplDTO teamName, int index) {// overloading of the method
		if (index < iplDTOs.length && index >= 0 && teamName != null) {
			this.iplDTOs[index] = teamName;
			System.out.println("Invoked create overloading method with : teamName and index");
		} else {
			System.out.println("Either the array is full or pointing to null ");
		}
	}

	public int indexOccupied() {
		System.out.println("Number of Indexes occupied is : ".concat(String.valueOf(soutu)));
		return soutu;
	}

	// for checking whether the name can be found in the memory or not
	public boolean matchByName(String nameOfTeam) {
		System.out.println("Invoked matchByName");
		System.out.println("Team name passed is : ".concat(nameOfTeam));

		for (int apple = 0; apple < this.iplDTOs.length; apple++) {

			IplDTO ref = this.iplDTOs[apple];// creating the reference for the IplDTO

			if (ref != null) {
				System.out.println("ref in index is not null ".concat(String.valueOf(apple)));
				String teammName = ref.getTeamName();
				System.out.println("Matching ".concat(teammName));

				if (nameOfTeam.equals(teammName)) {// checks the value of the variable:nameOfTeam & teammName
					System.out.println("team name is found");
					return true;
				}
			}
		}
		System.out.println("team name is not found");
		return false;
	}

}// end of class IplDAO
