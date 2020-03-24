package com.capgemini.go.dto;

public class UserDTO {

	private int userId;
	private String password;
	private String userName;

	public UserDTO( String password, String userName) {
		super();
		//this.userId = userId;
		this.password = password;
		this.userName = userName;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
}
