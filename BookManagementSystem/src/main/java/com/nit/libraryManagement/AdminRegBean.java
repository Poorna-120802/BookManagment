package com.nit.libraryManagement;

public class AdminRegBean 
{
	private String name,password,fname,lname,mailId,phno;

	public AdminRegBean()
	{
	}
	

	public void setName(String name) {
		this.name = name;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

	public void setPhno(String phno) {
		this.phno = phno;
	}

	public String getName() {
		return name;
	}

	public String getPassword() {
		return password;
	}

	public String getFname() {
		return fname;
	}

	public String getLname() {
		return lname;
	}

	public String getMailId() {
		return mailId;
	}

	public String getPhno() {
		return phno;
	}
	

}
