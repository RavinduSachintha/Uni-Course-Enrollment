package controllers;

import java.sql.Date;
import java.sql.SQLException;

import controllers.db.StudentDbController;
import models.Student;

public class StudentController {
	
	private Student studentViewObj;
	private Student studentDbObj;
	private StudentDbController sdc;;
	
	public StudentController() {
		this.sdc = new StudentDbController();
	}
	
	public void initaliseViewStudent(String stdID, String nic, String fname, String mname, String lname,
			String gender, Date dob, String addressLine1, String addressLine2, String city, 
			String pemail, String uemail, String phone) {
		this.studentViewObj = new Student(stdID, nic, fname, mname, lname, gender, dob, addressLine1,addressLine2, city, pemail,uemail,phone);
	}
	
	public Student getStudentViewObj() {
		return studentViewObj;
	}
	
	public Student getStudentDbObj() {
		return studentDbObj;
	}
	
	public void registerStudent() throws SQLException {
		sdc.insertStudent(this.studentViewObj);
	}
}
