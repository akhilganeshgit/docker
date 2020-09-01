package org.dxc.docker.model;

public class Customer {
	private String name;
	private String emailId;
	private String mobileNo;
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Customer(String name, String emailId, String mobileNo) {
		super();
		this.name = name;
		this.emailId = emailId;
		this.mobileNo = mobileNo;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	

}
