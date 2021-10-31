package com.xworkz.dp.dto;

public class InstagramApplicationDTO extends FacebookApplicationDTO{

	private Integer totalUsers;
	private String serverLocation;

	public InstagramApplicationDTO() {
		System.out.println("Invoked InstagramApplicationDTO no-arg constructor");
	}

	public InstagramApplicationDTO(Integer totalUsers, String serverLocation) {
		super();
		this.totalUsers = totalUsers;
		this.serverLocation = serverLocation;
	}

	public Integer getTotalUsers() {
		return totalUsers;
	}

	public void setTotalUsers(Integer totalUsers) {
		this.totalUsers = totalUsers;
	}

	public String getServerLocation() {
		return serverLocation;
	}

	public void setServerLocation(String serverLocation) {
		this.serverLocation = serverLocation;
	}

}
