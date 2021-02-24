package com.example.demo.model;

import lombok.Data;

public class User {
	
	//フィールド
	private int userId;
	private String password;
	private String userName;
	
	//getterとsetter
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
