package com.annular.myfirstpro.users;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Users {

	@Id
	long userId;
	String userName;
	String userPassword;
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	
	
}
