package com.xworkz.dp.starter;

import com.xworkz.dp.dao.ApplicationDAO;
import com.xworkz.dp.dao.ApplicationDAO1;
import com.xworkz.dp.dto.ApplicationDTO;
import com.xworkz.dp.dto.FacebookApplicationDTO;
import com.xworkz.dp.dto.InstagramApplicationDTO;

public class ApplicationStarter {

	public static void main(String[] args) {

		ApplicationDAO1 dao1 = new ApplicationDAO1();
		//Using Instanceof operator for multi level inheritance
		dao1.saveApplicationDTOs(new ApplicationDTO("Face Book", 2.4f, "Face Book", "Mark Zuckerberg"));
		dao1.saveApplicationDTOs(new ApplicationDTO("Insta", 3.5f, "Face Book", "Mark Zuckerberg"));
		dao1.saveApplicationDTOs(new FacebookApplicationDTO("Rakesh", "Bangalore"));
		dao1.saveApplicationDTOs(new InstagramApplicationDTO(10, "Singapore"));
		
		
		System.out.println("%%%%%%%%%% old method of doing %%%%%%%%%%");
		System.out.println();
		
		//old method of doing
		ApplicationDAO dao = new ApplicationDAO();
		dao.save(new ApplicationDTO("Face Book", 2.4f, "Face Book", "Mark Zuckerberg"));
		dao.save(new ApplicationDTO("Insta", 3.5f, "Face Book", "Mark Zuckerberg"));
		dao.getApplicationDTOByName("Insta");
		dao.displayAllApplicationDTOs();

		dao.save(new FacebookApplicationDTO("Rakesh", "Bangalore"));
		dao.getFaceBookApplicationDTOs();
		dao.save(new InstagramApplicationDTO(10, "Singapore"));
		dao.getInstagramApplicationDTO();

	}
}
