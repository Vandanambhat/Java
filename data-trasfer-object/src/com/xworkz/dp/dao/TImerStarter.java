package com.xworkz.dp.dao;

import com.xworkz.dp.dto.TimerDTO;

public class TImerStarter {

	public static void main(String[] args) {

		TimerDAO dao = new TimerDAO();
		dao.create(new TimerDTO(12.40f, false, true, "Rolex"));
		dao.create(new TimerDTO(1.35f, true, false, "Sonata"), 10);

		dao.create(new TimerDTO(11.30f, false, false, "Akash"));
		dao.indexOccupied();
		dao.matchByTime(11.30f);

		TimerDTO[] timeRef = dao.getDoc();

		for (int dora = 0; dora < timeRef.length; dora++) {

			TimerDTO ref = timeRef[dora];
			if (ref != null) {

				System.out.println(ref.getBrandName());
				System.out.println(ref.getCorrectTime());
				System.out.println(ref.isBell());
				System.out.println(ref.isDigital());
				System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
			} else {
				System.out.println("Either the array is full or pointing to null".concat(String.valueOf(dora)));
			}
		}
	}

}