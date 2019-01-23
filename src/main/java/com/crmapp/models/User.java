package com.crmapp.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="USERS")
public class User {

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="userid_number")
	private int userIdNumber;	
	
	@Column(length=30,name="email",unique=true,nullable=false)
	private String email;
	
	@Column(length=30,name="twitterlink")
	private String twitterlink;	
	@Column(length=10,name="usertype")
	private String usertype;	
	
	
	public int getUserIdNumber() {
		return userIdNumber;
	}
	public void setUserIdNumber(int userIdNumber) {
		this.userIdNumber = userIdNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTwitterlink() {
		return twitterlink;
	}
	public void setTwitterlink(String twitterlink) {
		this.twitterlink = twitterlink;
	}
	public String getUsertype() {
		return usertype;
	}
	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}
	
	
}
