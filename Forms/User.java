package com.advanced;

public class User {
	
	private String fName;
	private String lName;
	
	public User() {
		fName = "First Name";
		lName = "Last Name";
	}
	
	/**
	 * @return the fName
	 */
	public String getfName() {
		return fName;
	}
	/**
	 * @param fName the fName to set
	 */
	public void setfName(String fName) {
		this.fName = fName;
	}
	/**
	 * @return the lname
	 */
	public String getLName() {
		return lName;
	}
	/**
	 * @param lname the lname to set
	 */
	public void setLName(String lName) {
		this.lName = lName;
	}
	
	
}
