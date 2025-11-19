package com.nit.libraryManagement;

public class CustomerBean 
{
	private String cName,password,fName,lName,mailId;
	private long phno;
	public void setcName(String cName) {
		this.cName = cName;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	public String getcName() {
		return cName;
	}
	public String getPassword() {
		return password;
	}
	public String getfName() {
		return fName;
	}
	public String getlName() {
		return lName;
	}
	public String getMailId() {
		return mailId;
	}
	public long getPhno() {
		return phno;
	}
	
	

}
