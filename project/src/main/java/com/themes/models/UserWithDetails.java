package com.themes.models;



public class UserWithDetails {
	
	
	private String username;
	private String city;
	
	
	
	

	public UserWithDetails(String username, String city) {
		super();
		this.username = username;
		this.city = city;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	
	
}
