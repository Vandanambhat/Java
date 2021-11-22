package com.xworkz.dp.dao;

import com.xworkz.dp.dto.ApplicationDTO;
import com.xworkz.dp.dto.FacebookApplicationDTO;
import com.xworkz.dp.dto.InstagramApplicationDTO;

public class ApplicationDAO1 {

	public ApplicationDTO[] appDTOs = new ApplicationDTO[10];
	public int count = 0;

	public void saveApplicationDTOs(ApplicationDTO dto) {

		System.out.println("Invoked Save ApplicationDTO");
		if (dto != null && this.count < this.appDTOs.length) {
			this.appDTOs[this.count++] = dto;

//			if (dto instanceof ApplicationDTO) {
//				System.out.println("dto instanceof ApplicationDTO");
//				ApplicationDTO app = (ApplicationDTO) dto;
			System.out.println(dto.getCompany());
			System.out.println(dto.getFounder());
			System.out.println(dto.getName());
			System.out.println(dto.getVersion());
//				System.out.println("++++++++++++++++++++++++++++++++");
//				System.out.println(app.getCompany());
//				System.out.println(app.getFounder());
//				System.out.println(app.getName());
//				System.out.println(app.getVersion());}

			System.out.println("-------------------------");
			if (dto instanceof FacebookApplicationDTO) {
				System.out.println("dto instanceof FacebookApplicationDTO");
				FacebookApplicationDTO fb = (FacebookApplicationDTO) dto;

				System.out.println(fb.getVersion());
				System.out.println(fb.getCompany());
				System.out.println(fb.getFounder());
				System.out.println(fb.getName());
				System.out.println(fb.getHeadQuarter());
				System.out.println(fb.getCeoName());
				System.out.println("++++++++++++++++++++++++++++++++");
				System.out.println(dto.getCompany());
				System.out.println(dto.getFounder());
				System.out.println(dto.getName());
				System.out.println(dto.getVersion());
				System.out.println(((FacebookApplicationDTO) dto).getHeadQuarter());
				System.out.println(((FacebookApplicationDTO) dto).getCeoName());
			}
			System.out.println("-------------------------");
			if (dto instanceof InstagramApplicationDTO) {
				System.out.println("dto instanceof InstagramApplicationDTO");
				InstagramApplicationDTO insta = (InstagramApplicationDTO) dto;
				System.out.println(insta.getCompany());
				System.out.println(insta.getFounder());
				System.out.println(insta.getName());
				System.out.println(insta.getVersion());
				System.out.println(insta.getServerLocation());
				System.out.println(insta.getVersion());
				System.out.println("++++++++++++++++++++++++++++++++");
				System.out.println(dto.getCompany());
				System.out.println(dto.getFounder());
				System.out.println(dto.getName());
				System.out.println(dto.getVersion());
				System.out.println(((InstagramApplicationDTO) dto).getServerLocation());
				System.out.println(((InstagramApplicationDTO) dto).getTotalUsers());
			}
			System.out.println("-------------------------");
		} else {
			System.out.println("The array is pointing to null");
		}
	}// end of saveApplicationDTOs

	public void displayAllApplicationDTOs() {
		for (int chimpanzee = 0; chimpanzee < this.appDTOs.length; chimpanzee++) {
			ApplicationDTO ref = this.appDTOs[chimpanzee];

			if (ref != null & this.count < this.appDTOs.length) {
			}

		}
	}

}// end of ApplicationDAO1
