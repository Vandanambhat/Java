package com.xworkz.dp.dao;

import com.xworkz.dp.dto.TimerDTO;

public class TimerDAO {

	private TimerDTO[] time = new TimerDTO[15];
	private int count = 0;

	public TimerDTO[] getDoc() {
		return time;
	}

	public void create(TimerDTO dto) {
		if (time != null) {
			this.time[count++] = dto;
			System.out.println("Invoked create method with dto ");
		}
	}

	public void create(TimerDTO brandName, int index) {
		if (brandName != null && index < time.length && index >= 0) {
			this.time[index] = brandName;
			System.out.println("Invoked overloading create method with age and index");
		} else {
			System.out.println("Either the array is full or pointing to null");
		}
	}

	public int indexOccupied() {
		System.out.println("Index occupied is : ".concat(String.valueOf(count)));
		return this.count;
	}

	public boolean matchByTime(Float correctTime) {

		for (int kuri = 0; kuri < time.length; kuri++) {
			TimerDTO ref = this.time[kuri];

			if (time != null) {
				System.out.println("array index is not null ".concat(String.valueOf(kuri)));

				Float correct = ref.getCorrectTime();
				System.out.println("correct time is : ".concat(String.valueOf(correct)));

				if (correct.equals(correctTime)) {
					System.out.println("correct time is same");
					return true;
				}
//					else
//					{
//						System.out.println("correct time match is not same");
//					}
			}
		}
		System.out.println("correct time is not same");
		return false;
	}
}// end of TimerDAO
