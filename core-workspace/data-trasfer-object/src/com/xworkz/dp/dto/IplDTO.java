package com.xworkz.dp.dto;

public class IplDTO {

	private String teamName;
	private Integer noOfTeams;
	private Integer teamSize;
	private String ownerName;
	private String sponsorName;

	public IplDTO() {
		System.out.println("Invoked IplDTO No-Arg Constructor");
	}

	public IplDTO(String teamName, Integer noOfTeams, Integer teamSize, String ownerName, String sponsorName) {
		super();
		this.teamName = teamName;
		this.noOfTeams = noOfTeams;
		this.teamSize = teamSize;
		this.ownerName = ownerName;
		this.sponsorName = sponsorName;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public Integer getNoOfTeams() {
		return noOfTeams;
	}

	public void setNoOfTeams(Integer noOfTeams) {
		this.noOfTeams = noOfTeams;
	}

	public Integer getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(Integer teamSize) {
		this.teamSize = teamSize;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getSponsorName() {
		return sponsorName;
	}

	public void setSponsorName(String sponsorName) {
		this.sponsorName = sponsorName;
	}
}
