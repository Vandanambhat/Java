package com.xworkz.dp.starter;

import com.xworkz.dp.dao.LawyerDAO;
import com.xworkz.dp.dto.LawyerDTO;
//import com.xworkz.dp.dto.LawyerDTO;

public class LawyerStarter {

	public static void main(String[] args) {

		LawyerDAO dao = new LawyerDAO();
//		LawyerDTO(String name, String qualification, Float experience, String gender, Integer age, 
//		String courtType,Integer casesWon, Integer casesLost)

		dao.save(new LawyerDTO("Mallikarjun", "LLB", 6f, "Male", 24, "High Court", 5, 1));
		dao.save(new LawyerDTO("Thrishul", "BA LLB", 3f, "Male", 25, "Supreme Court", 6, 0));
		dao.save(new LawyerDTO("Vandana", "LLB", 9f, "Female", 23, "Supreme Court", 10, 1));
		dao.save(new LawyerDTO("Rakesh", "LLB", 2f, "Male", 26, "High Court", 4, 1));
		dao.save(new LawyerDTO("Gomtesh", "BA LLB", 1f, "Male", 24, "Supreme Court", 3, 2));

		dao.save(new LawyerDTO("Harshitha", "LLB", 4f, "Female", 23, "High Court", 7, 2), 1);

		dao.delete(0);
		dao.searchByCasesWon(2);
		dao.getExpByName("Rakesh");
		dao.getLawyerWithMaxExp();
		dao.getQualificationByName("Gomtesh");

		LawyerDTO[] lawyerRef = dao.getLawyerDTOs();

		for (int kalla = 0; kalla < lawyerRef.length; kalla++) {

			LawyerDTO ref = lawyerRef[kalla];
			if (ref != null) {
				System.out.println(ref.getName());
				System.out.println(ref.getCourtType());
				System.out.println(ref.getGender());
				System.out.println(ref.getQualification());
				System.out.println(ref.getAge());
				System.out.println(ref.getCasesWon());
				System.out.println(ref.getCasesLost());
				System.out.println(ref.getExperience());
				System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
			} else {
				System.out.println("Either the array is full or pointing to null".concat(String.valueOf(kalla)));
			}
		}
	}

	LawyerDTO dto = new LawyerDTO();

}// end of LawyerStarter
