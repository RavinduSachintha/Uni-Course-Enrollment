package controllers;

import java.sql.SQLException;

import controllers.db.LoginDbController;
import models.User;

public class LoginController {
	
	private User userViewObj;
	private User userDbObj;
	
	public void initaliseViewUser(String user, String password) {
		this.userViewObj = new User(user, password);
	}
	
	public User getViewUser() {
		return this.userViewObj;
	}
	
	public void initaliseDbUser(String user) throws SQLException {
		this.userDbObj = new LoginDbController().getUser(user);
	}
	
	public User getDbUser() {
		return this.userDbObj;
	}
	
	public boolean validateUser() {
		if(userViewObj.getUser() == userDbObj.getUser() 
				&& userViewObj.getPassword() == userDbObj.getPassword())
			return true;
		else
			return false;
	}
}
