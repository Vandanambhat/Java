package com.xworkz.dp.dao;

import com.xworkz.dp.dto.MovieDTO;

public class MovieStarter {

	public static void main(String[] args) {

		MovieDAO dao = new MovieDAO();
		dao.create(new MovieDTO("KGF", "Ayyappa", "Yash", "rakesh", 9));
		dao.create(new MovieDTO("Kotigobba 3", "Arjun", "Sudeep", "rakesh", 9));

		dao.create(new MovieDTO("Love Stroy", "thrishul", "Sai Pallavi", "vandana", 8), 4);
		dao.indexOccupied();
		dao.matchActorName("Sai Pallavi");

		MovieDTO[] movieRef = dao.getmovieDTOs();

		for (int moti = 0; moti < movieRef.length; moti++) {

			MovieDTO ref = movieRef[moti];
			if (ref != null) {
				System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
				System.out.println(ref.getActorName());
				System.out.println(ref.getDirectorName());
				System.out.println(ref.getMovieName());
				System.out.println(ref.getProducerName());
				System.out.println(ref.getRating());
				System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
			} else {
				System.out.println("Either the array is full or pointing to null".concat(String.valueOf(moti)));
			}
		}
	}

}
