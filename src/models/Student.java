package models;

public class Student {
	
	private String stdID;
	private String nic;
	private String fname;
	private String mname;
	private String lname;
	private String gender;
	private String addressLine1;
	private String addressLine2;
	private String city;
	private String pemail;
	private String uemail;
	private String phone;
	
	public Student(String stdID, String nic, String fname, String mname, String lname,
			String gender, String addressLine1, String addressLine2, String city, 
			String pemail, String uemail, String phone) {
		this.stdID = stdID;
		this.nic = nic;
		this.fname = fname;
		this.mname = mname;
		this.lname = lname;
		this.gender = gender;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.city = city;
		this.pemail = pemail;
		this.uemail = uemail;
		this.phone = phone;
		
	}
	
	
}
