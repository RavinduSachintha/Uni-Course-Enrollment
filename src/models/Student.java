package models;

import java.sql.Date;

public class Student {
	
	private String stdID;
	private String nic;
	private String fname;
	private String mname;
	private String lname;
	private String gender;
	private Date dob;
	private String addressLine1;
	private String addressLine2;
	private String city;
	private String pemail;
	private String uemail;
	private String phone;
	
	public Student(String stdID, String nic, String fname, String mname, String lname,
			String gender, Date dob, String addressLine1, String addressLine2, String city, 
			String pemail, String uemail, String phone) {
		this.stdID = stdID;
		this.nic = nic;
		this.fname = fname;
		this.mname = mname;
		this.lname = lname;
		this.gender = gender;
		this.dob = dob;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.city = city;
		this.pemail = pemail;
		this.uemail = uemail;
		this.phone = phone;
		
	}

	public String getStdID() {
		return stdID;
	}

	public String getNic() {
		return nic;
	}

	public String getFname() {
		return fname;
	}

	public String getMname() {
		return mname;
	}

	public String getLname() {
		return lname;
	}

	public String getGender() {
		return gender;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public String getCity() {
		return city;
	}

	public String getPemail() {
		return pemail;
	}

	public String getUemail() {
		return uemail;
	}

	public String getPhone() {
		return phone;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}
	
}
