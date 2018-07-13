package controllers;

import models.Student;

public class StudentController {
	
	private Student studentViewObj;
	private Student studnetDbObj;
	
	public void initaliseViewStudent(String stdID, String nic, String fname, String mname, String lname,
			String gender, String addressLine1, String addressLine2, String city, 
			String pemail, String uemail, String phone) {
		this.studentViewObj = new Student(stdID, nic, fname, mname, lname, gender, addressLine1,addressLine2, city, pemail,uemail,phone);
	}
	
	public Student getStudentViewObj() {
		return studentViewObj;
	}
	
	public Student getStudnetDbObj() {
		return studnetDbObj;
	}
	
	
}
