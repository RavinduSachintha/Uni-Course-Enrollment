package controllers.db;

import java.sql.Connection;

public class LoginDbController {
	
	private Connection con;
	
	public LoginDbController() {
		this.con = new DBmanager().getConnection();
	}
}
