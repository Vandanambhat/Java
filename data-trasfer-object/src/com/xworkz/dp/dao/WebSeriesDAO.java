package com.xworkz.dp.dao;

import com.xworkz.dp.dto.WebSeriesDTO;

public class WebSeriesDAO {

	private WebSeriesDTO[] dto = new WebSeriesDTO[5];

	private int increment = 0;
	int length = this.dto.length;

	public void addWebSeries(WebSeriesDTO webSeriesDTO) {
		if (this.increment < length) {
			this.dto[this.increment++] = webSeriesDTO;
			System.out.println("Argument passed is ".concat(String.valueOf(dto)));
		}
	}

	public void deleteWebSeries(int no) {
		if (no < length && no >= 0) {
			this.dto[no] = null;
			System.out.println("deleted index is ".concat(String.valueOf(no)));
		} else {
			System.err.println("Error : The given index value cant be deleted");
		}
	}

	public void updateWebSeries(int no, WebSeriesDTO genre) {
		if (no < length && no >= 0 && genre != null) {
			this.dto[no] = genre;
			System.out.println("The updated index value is ".concat(String.valueOf(no)));
		} else {
			System.err.println("not able to update index");
		}
	}

	public WebSeriesDTO[] getDto() {
		return dto;
	}

}