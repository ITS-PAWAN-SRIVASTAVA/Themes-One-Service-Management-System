package com.themes.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter

@Builder
@ToString
public class JWTResponse {
	
	String username;
	String token;
	
	
	
	public JWTResponse() {
		super();
	}
	public JWTResponse(String username, String token) {
		super();
		this.username = username;
		this.token = token;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	
	
	
	
	
	
	
	
	

}
