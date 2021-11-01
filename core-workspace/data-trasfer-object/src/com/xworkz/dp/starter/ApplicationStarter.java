package com.xworkz.dp.starter;

import com.xworkz.dp.dao.ApplicationDAO;
import com.xworkz.dp.dto.ApplicationDTO;
import com.xworkz.dp.dto.FacebookApplicationDTO;
import com.xworkz.dp.dto.InstagramApplicationDTO;
public class ApplicationStarter {

	public static void main(String[] args) {
		
		ApplicationDAO dao=new ApplicationDAO();
		dao.save(new ApplicationDTO("Face Book", 2.4f, "Face Book", "Mark Zuckerberg"));
		dao.save(new ApplicationDTO("Insta",3.5f, "Face Book", "Mark Zuckerberg"));
		dao.getApplicationDTOByName("Insta");
		
		dao.save(new FacebookApplicationDTO("Rakesh","Bangalore"));
		dao.displayAllApplicationDTOs();
		
//		ApplicationDTO application=new ApplicationDTO();
//		InstagramApplicationDTO instagramApplicationDTO=(InstagramApplicationDTO)application;
		
		
		
	
				}

}
