package com.xworkz.dp.dao;

import com.xworkz.dp.dto.MovieDTO;

public class MovieDAO {

	MovieDTO[] movieDTOs = new MovieDTO[10];
	private int count = 0;

	public MovieDTO[] getmovieDTOs() {
		return movieDTOs;
	}

	public void create(MovieDTO dto) {
		if (dto != null) {
			System.out.println("Invoked create method with dto");
			this.movieDTOs[count++] = dto;
		}
	}

	public void create(MovieDTO movieName, int lilly) {
		if (movieName != null && lilly < movieDTOs.length && lilly >= 0) {
			this.movieDTOs[lilly] = movieName;
			System.out.println("Invoked overloading create method");
		} else {
			System.out.println("Either the array is full or pointing to null ");
		}
	}

	public int indexOccupied() {
		System.out.println("Index occupied is : ".concat(String.valueOf(count)));
		return count;
	}

	public boolean matchActorName(String actorName) {
		System.out.println("Invoked matchMovieName");

		System.out.println("Actor name passed is : ".concat(actorName));
		for (int i = 0; i < this.movieDTOs.length; i++) {
			MovieDTO ref = this.movieDTOs[i];

			if (ref != null) {
				System.out.println("The array index is not null at index : ".concat(String.valueOf(i)));

				String actorRef = ref.getActorName();
				System.out.println("Actor name is : ".concat(actorRef));

				if (actorRef.equals(actorName)) {
					System.out.println("Actor name is found");
					return true;
				}
			}
		}
		System.out.println("Actor name is not found");
		return false;

	}
}// end of MovieDAO
