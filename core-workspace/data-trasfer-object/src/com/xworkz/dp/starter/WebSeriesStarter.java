package com.xworkz.dp.starter;

import com.xworkz.dp.dao.WebSeriesDAO;
import com.xworkz.dp.dto.WebSeriesDTO;

public class WebSeriesStarter {

	public static void main(String[] args) {

		// giving values using the getter and setter method
		WebSeriesDTO webSeriesDTO = new WebSeriesDTO();
		webSeriesDTO.setName("Vampire Diaries");
		webSeriesDTO.setGenre("Horror");
		webSeriesDTO.setCast("Ayyappa and Rakesh");
		webSeriesDTO.setNoOfCharacters(10);
		webSeriesDTO.setRating(9.5f);
		webSeriesDTO.setTotalSeasons(10);
		webSeriesDTO.setCurrentSeason(8);

		// giving values using parameterized constructor
		WebSeriesDTO webSeriesDTO1 = new WebSeriesDTO("Originals", "Horror", "Harshitha and mallikarjun", 12, 9.6f, 7,
				9);
		WebSeriesDTO webSeriesDTO2 = new WebSeriesDTO("The King", "Romantic", "Lee Min Hoo", 4, 10f, 1, 1);
		WebSeriesDTO webSeriesDTO3 = new WebSeriesDTO("Dark", "Scientific", "Gomtesh", 3, 8f, 2, 3);

//		// array declaration and initialization
//		WebSeriesDTO[] web = new WebSeriesDTO[5];
//
//		// assigning values to reference
//		web[0] = webSeriesDTO;
//		web[1] = webSeriesDTO1;
//		web[2] = webSeriesDTO2;
//		web[3] = webSeriesDTO3;

		WebSeriesDAO webSeriesDAO = new WebSeriesDAO();
		webSeriesDAO.addWebSeries(webSeriesDTO3);
		webSeriesDAO.addWebSeries(webSeriesDTO1);
		webSeriesDAO.addWebSeries(webSeriesDTO2);
		webSeriesDAO.addWebSeries(webSeriesDTO);
		webSeriesDAO.deleteWebSeries(2);
		webSeriesDAO.updateWebSeries(1, webSeriesDTO);

		WebSeriesDTO[] ref = webSeriesDAO.getDto();

		// iterations for printing the array values
		for (int pani = 0; pani < ref.length; pani++) {
			WebSeriesDTO newRef = ref[pani];

			// System.out.println(ref[pani]); //gives null

			if (ref != null) {
				System.out.println(newRef.getName());
				System.out.println(newRef.getGenre());
				System.out.println(newRef.getCast());
				System.out.println(newRef.getNoOfCharacters());
				System.out.println(newRef.getRating());
				System.out.println(newRef.getTotalSeasons());
				System.out.println(newRef.getCurrentSeason());
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			}
		}
	}

}
