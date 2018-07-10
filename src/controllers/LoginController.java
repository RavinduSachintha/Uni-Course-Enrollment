package controllers;

import models.User;

public class LoginController {
	
	private User userObj;
	
	public void initaliseUser(String user, String password) {
		this.userObj = new User(user, password);
	}
	
	public User getUser() {
		return this.userObj;
	}
	
	public boolean authUser(User u1,User u2) {
		if(u1.getUser() == u2.getUser() && u1.getPassword() == u2.getPassword())
			return true;
		else
			return false;
	}
}
