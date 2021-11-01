package com.xworkz.dp.dao;

import com.xworkz.dp.dto.ApplicationDTO;
import com.xworkz.dp.dto.FacebookApplicationDTO;
import com.xworkz.dp.dto.InstagramApplicationDTO;
import com.xworkz.dp.dto.LawyerDTO;

public class ApplicationDAO {

	public ApplicationDTO[] appDTOs = new ApplicationDTO[2];
	public FacebookApplicationDTO[] faceDTOs = new FacebookApplicationDTO[2];
	public InstagramApplicationDTO[] instaDTOs = new InstagramApplicationDTO[2];
	public int count = 0;

	public FacebookApplicationDTO[] getFacebook() {
		return faceDTOs;
	}

	public InstagramApplicationDTO[] getInstagram() {
		return instaDTOs;
	}

	public void save(ApplicationDTO dto) {
		if (dto != null) {
			this.appDTOs[count++] = dto;
			System.out.println("Invoked save method");
		} else {
			System.out.println("pointing to null");
		}
	}

	public void displayAllApplicationDTOs() {
		for (int jamoon = 0; jamoon < appDTOs.length; jamoon++) {
			ApplicationDTO moon = this.appDTOs[jamoon];
			System.out.println(moon);
		}
	}

	public ApplicationDTO getApplicationDTOByName(String name) {
		for (int pikachu = 0; pikachu < appDTOs.length; pikachu++) {
			System.out.println("Invoked getApplicationDTOByName method");
			ApplicationDTO appRef = this.appDTOs[pikachu];
			if (appRef != null) {
				System.out.println("array index is not null ".concat(String.valueOf(pikachu)));
				String ref = appRef.getName();
				System.out.println("Name passed is : ".concat(ref));
				if (ref.equals(name)) {
					System.out.println("Name is found");
				} else {
					System.out.println("name not found");
				}
			}
		}

		return null;
	}

	public FacebookApplicationDTO[] getFaceBookApplicationDTOs() {
		System.out.println("Invoked getFaceBookApplicationDTOs method");
		for (int pikachu = 0; pikachu < appDTOs.length; pikachu++) {
		
			FacebookApplicationDTO appRef = this.faceDTOs[pikachu];
			if (appRef != null) {
				System.out.println("array index is not null ".concat(String.valueOf(pikachu)));
				System.out.println(appRef.getName());
			}
		}
		return faceDTOs;
	}

	public InstagramApplicationDTO[] getInstagramApplicationDTO() {
		return instaDTOs;

	}
}
