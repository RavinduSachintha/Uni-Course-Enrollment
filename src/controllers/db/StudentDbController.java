package controllers.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import models.Student;

public class StudentDbController {
	
	private Connection con;
	
	public StudentDbController() {
		this.con = new DBmanager().getConnection();
	}
	
	public void insertStudent(Student std) throws SQLException {

		String sql = "INSERT INTO `students`("
				+ "`StdID`, `Nic`, `Fname`, `Mname`, `Lname`, `Gender`, `Dob`, `AddLine1`, "
				+ "`AddLine2`, `City`, `Pemail`, `Uemail`, `Phone`) VALUES ("
				+ "?,?,?,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement stm = this.con.prepareStatement(sql);
		stm.setObject(1, std.getStdID());
		stm.setObject(2, std.getNic());
		stm.setObject(3, std.getFname());
		stm.setObject(4, std.getMname());
		stm.setObject(5, std.getLname());
		stm.setObject(6, std.getGender());
		stm.setObject(7, std.getDob());
		stm.setObject(8, std.getAddressLine1());
		stm.setObject(9, std.getAddressLine2());
		stm.setObject(10, std.getCity());
		stm.setObject(11, std.getPemail());
		stm.setObject(12, std.getUemail());
		stm.setObject(13, std.getPhone());
		stm.executeUpdate();
	}
}
