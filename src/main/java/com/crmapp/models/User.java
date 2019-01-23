package com.crmapp.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

@Entity(name="CRM_USERS")
public class User {

//	 [USER_UID]        int IDENTITY (1, 1) NOT NULL ,
//	 [EMAIL]           varchar(50) NOT NULL ,
//	 [NAME]            varchar(50) NOT NULL ,
//	 [MOBILE_PREFIX]   varchar(5) NOT NULL ,
//	 [MOBILE_NO]       int NOT NULL ,
//	 [PASSWORD]        nvarchar(20) NOT NULL ,
//	 [USER_ROLE]       varchar(15) NOT NULL ,
//	 [ACTIVE]          bit NOT NULL ,
//	 [PROFILE_PICTURE] int NOT NULL ,
//	 [IMAGE_UID]       int NOT NULL ,
//	 [CREATED_BY]      int NOT NULL ,
//	 [CREATED_DATE]    datetime NOT NULL ,
//	 [MODIFIED_BY]     int NOT NULL ,
//	 [MODIFIED_DATE]   datetime NOT NULL ,
	
	
	public User() {
	
	}  
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="USER_UID")
	private int userUid;	
	
	@Column(length=50,name="EMAIL",unique=true,nullable=false)
	private String email;
	
	@Column(length=50,name="NAME",nullable=false)
	private String name;
	
	@Column(name="MOBILE_PREFIX",nullable=false)
	private int mobilePrefix;
	
	@Column(name="MOBILE_NO",nullable=false)
	private long mobileNo;
	
	@Column(length=20,name="PASSWORD",nullable=false)
	private String password;
	
	@Column(name="USER_ROLE",nullable=false)
	private String userRole;
	
	@Column(name="ACTIVE",nullable=false)
	private boolean active;
	
	@Column(name="IMAGE_UID",nullable=true)
	private int imageUid;
	
	@Column(length=1000,name="DESCRIPTION",nullable=true)
	private String description;	
	
	@Column(name="CREATED_BY",nullable=false)
	private int createdBy;
	
	@Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp
	@Column(name="CREATED_DATE",nullable = false)
	private Date createdDate; 	
	
	@Column(name="MODIFIED_BY",nullable=false)
	private int modifiedBy;
	
	@Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp
	@Column(name="MODIFIED_DATE",nullable = false)
	private Date modifiedDate;
	
	public int getUserUid() {
		return userUid;
	}
	public void setUserUid(int userUid) {
		this.userUid = userUid;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMobilePrefix() {
		return mobilePrefix;
	}
	public void setMobilePrefix(int mobilePrefix) {
		this.mobilePrefix = mobilePrefix;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserRole() {
		return userRole;
	}
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public int getImageUid() {
		return imageUid;
	}
	public void setImageUid(int imageUid) {
		this.imageUid = imageUid;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public int getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(int modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	public Date getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	
	
	
	
}
