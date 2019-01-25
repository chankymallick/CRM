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

@Entity(name="CONTACT")
public class Contact {
	
	public Contact(){
		
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="CONTACT_UID")
	private int contactUid; 
	
	@Column(name="CUSTOMER_ID",nullable=false)
	private int contactId;
	
	@Column(name="PRIMARY_PREFIX",nullable=false)
	private int primaryPrefix;
	
	@Column(name="PRIMARY_MOBILE",nullable=false)
	private long primaryMobile;
	
	@Column(name="SECONDARY_PREFIX",nullable=true)
	private int secondaryPrefix;
	
	@Column(name="SECONDARY_MOBILE",nullable=true)
	private long secondaryMobile;
	
	@Column(name="LANDLINE",nullable=true)
	private long landline;
	
	@Column(length=50,name="EMAIL",nullable=true)
	private long email;	
	
	@Column(length=2000,name="NOTE",nullable=true)
	private String note;
	
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
	
	
	
	

	public int getContactUid() {
		return contactUid;
	}

	public void setContactUid(int contactUid) {
		this.contactUid = contactUid;
	}

	public int getContactId() {
		return contactId;
	}

	public void setContactId(int contactId) {
		this.contactId = contactId;
	}

	public int getPrimaryPrefix() {
		return primaryPrefix;
	}

	public void setPrimaryPrefix(int primaryPrefix) {
		this.primaryPrefix = primaryPrefix;
	}

	public long getPrimaryMobile() {
		return primaryMobile;
	}

	public void setPrimaryMobile(long primaryMobile) {
		this.primaryMobile = primaryMobile;
	}

	public int getSecondaryPrefix() {
		return secondaryPrefix;
	}

	public void setSecondaryPrefix(int secondaryPrefix) {
		this.secondaryPrefix = secondaryPrefix;
	}

	public long getSecondaryMobile() {
		return secondaryMobile;
	}

	public void setSecondaryMobile(long secondaryMobile) {
		this.secondaryMobile = secondaryMobile;
	}

	public long getLandline() {
		return landline;
	}

	public void setLandline(long landline) {
		this.landline = landline;
	}

	public long getEmail() {
		return email;
	}

	public void setEmail(long email) {
		this.email = email;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
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
