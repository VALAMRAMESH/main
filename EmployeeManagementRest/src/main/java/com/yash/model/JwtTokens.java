package com.yash.model;

public class JwtTokens 
{
	String token;

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public JwtTokens(String token) {
		super();
		this.token = token;
	}
	
}
