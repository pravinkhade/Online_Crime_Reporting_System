package com.app.dto;

public class LoginRequest {
	private String userEmail;
	private String userPassword;
	public LoginRequest() {
	
	}
	public LoginRequest(String userEmail, String userPassword) {
		super();
		this.userEmail = userEmail;
		this.userPassword = userPassword;
	}
	public String getuserEmail() {
		return userEmail;
	}
	public void setuserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getuserPassword() {
		return userPassword;
	}
	public void setuserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	@Override
	public String toString() {
		return "LoginRequest [email=" + userEmail + ", password=" + userPassword + "]";
	}
	
	
}
