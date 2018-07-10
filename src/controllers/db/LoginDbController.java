package controllers.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import models.User;

public class LoginDbController {
	
	private Connection con;
	
	public LoginDbController() {
		this.con = new DBmanager().getConnection();
	}
	
	public User getUser(String user) throws SQLException {
		String sql = "SELECT password FROM users WHERE user=?";
		PreparedStatement stm = this.con.prepareStatement(sql);
		stm.setObject(1, user);
		ResultSet rs = stm.executeQuery();
		rs.next();
		return new User(user,rs.getString(1));
	}
}
