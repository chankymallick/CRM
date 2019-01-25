package com.crmapp.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="PERMISSION")
public class Permission {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="PERMISSION_UID")
	private int permissionUid;	
	@Column(name="USER_UID",nullable=false)
	private int userUid;
	@Column(length=100,name="PERMISSION_NAME",nullable=false)
	private String permissionName;
	@Column(length=100,name="DESCRIPTION",nullable=false)
	private String description;
	
	
	
	
	
	public Permission(){
		
	}	
	public int getPermissionUid() {
		return permissionUid;
	}


	public void setPermissionUid(int permissionUid) {
		this.permissionUid = permissionUid;
	}


	public int getUserUid() {
		return userUid;
	}


	public void setUserUid(int userUid) {
		this.userUid = userUid;
	}


	public String getPermissionName() {
		return permissionName;
	}


	public void setPermissionName(String permissionName) {
		this.permissionName = permissionName;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}



}
