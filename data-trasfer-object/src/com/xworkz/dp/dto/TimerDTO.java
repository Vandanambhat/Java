package com.xworkz.dp.dto;

public class TimerDTO {

	private Float correctTime;
	private Boolean digital;
	private Boolean bell;
	private String brandName;

	public TimerDTO() {

	}

	public TimerDTO(Float correctTime, boolean digital, boolean bell, String brandName) {
		super();
		this.correctTime = correctTime;
		this.digital = digital;
		this.bell = bell;
		this.brandName = brandName;
	}

	public Float getCorrectTime() {
		return correctTime;
	}

	public void setCorrectTime(Float correctTime) {
		this.correctTime = correctTime;
	}

	public boolean isDigital() {
		return digital;
	}

	public void setDigital(boolean digital) {
		this.digital = digital;
	}

	public boolean isBell() {
		return bell;
	}

	public void setBell(boolean bell) {
		this.bell = bell;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

}
