package controllers.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBmanager {
	
	private final String driver = "com.mysql.cj.jdbc.Driver";
	private final String url = "jdbc:mysql://localhost/nsbm";
	private final String username = "root";
	private final String password = "";
	
	private Connection con;
	
	public DBmanager() {
		
		// Check for the driver
		try {
			Class.forName(this.driver);
			
			// Check for the connection
			try {
				con = DriverManager.getConnection(this.url, this.username, this.password);
			} catch(SQLException ex) {
				System.out.println("Connection not build...\nSQL error occured\n" + ex.getMessage());
				return;
			}
		} catch(ClassNotFoundException ex) {
			System.out.println("Failed to load the driver\n" + ex.getMessage());
			return;
		}
	}
	
	public Connection getConnection() { 
		return con;
	}
}
