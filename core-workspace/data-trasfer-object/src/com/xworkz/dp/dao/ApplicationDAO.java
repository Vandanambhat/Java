package com.xworkz.dp.dao;

import com.xworkz.dp.dto.ApplicationDTO;
import com.xworkz.dp.dto.FacebookApplicationDTO;
import com.xworkz.dp.dto.InstagramApplicationDTO;
import com.xworkz.dp.dto.LawyerDTO;

public class ApplicationDAO {

	public ApplicationDTO[] appDTOs = new ApplicationDTO[4];
	public FacebookApplicationDTO[] faceDTOs = new FacebookApplicationDTO[4];
	public InstagramApplicationDTO[] instaDTOs = new InstagramApplicationDTO[4];
	public int count = 0;

	public FacebookApplicationDTO[] getFacebook() {
		return faceDTOs;
	}

	public InstagramApplicationDTO[] getInstagram() {
		return instaDTOs;
	}

	public void save(ApplicationDTO dto) {
		if (dto != null && this.count<this.appDTOs.length){
			this.appDTOs[count++] = dto;
			System.out.println("Invoked save method");
		} else {
			System.out.println("pointing to null");
		}
	}
	
	public void save(FacebookApplicationDTO dto) {
		if (this.count<this.faceDTOs.length && dto!=null) {
			
			this.faceDTOs[this.count++]=dto;
			System.out.println("Invoked FacebookApplicationDTO method");
		} else {
			System.out.println("pointing to null");
		}
	}
	
	public void save(InstagramApplicationDTO dto) {
		if (dto != null) {
			this.instaDTOs[count++] = dto;
			System.out.println("Invoked InstagramApplicationDTO method");
		} else {
			System.out.println("pointing to null");
		}
	}

	public void displayAllApplicationDTOs() {
		for (int jamoon = 0; jamoon < appDTOs.length; jamoon++) {
			ApplicationDTO moon = this.appDTOs[jamoon];
			if(moon!=null) {
			System.out.println(moon.getName());
			System.out.println(moon.getCompany());
			System.out.println(moon.getFounder());
			System.out.println(moon.getVersion());
			}
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
		for (int kothi = 0; kothi < faceDTOs.length; kothi++) {
		
			FacebookApplicationDTO faceRef =(FacebookApplicationDTO) this.faceDTOs[kothi];
			if (faceRef != null) {
				System.out.println("array index is not null ".concat(String.valueOf(kothi)));
				System.out.println(faceRef.getName());
			}
		}
		return faceDTOs;
	}

	public InstagramApplicationDTO[] getInstagramApplicationDTO() {
		System.out.println("Invoked getInstagramApplicationDTO method");
		for (int kuri = 0; kuri < instaDTOs.length; kuri++) {
		
			FacebookApplicationDTO instaRef = this.faceDTOs[kuri];
			if (instaRef != null) {
				System.out.println("array index is not null ".concat(String.valueOf(kuri)));
				System.out.println(instaRef.getName());
			}
		}
		return instaDTOs;

	}
}
