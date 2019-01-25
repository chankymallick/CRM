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

@Entity(name="LEAD")
public class Lead {
	
	public Lead(){
		
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="LEAD_UID")
	private int leadUid;
	
	@Column(name="CUSTOMER_ID",nullable=false)//Foreing Key CustomerId>customer
	private int customerUid;
	
	@Column(length=1000,name="LEAD_DESCRIPTION",nullable=true)
	private String description;
	
	@Column(length=50,name="LEAD_SOURCE",nullable=false)
	private String leadSource;
	
	@Column(length=50,name="STATUS",nullable=false)
	private String status;
	
	@Column(name="RATING",nullable=true)
	private int rating;
	
	@Column(length=2000,name="NOTE",nullable=true)
	private int NOTE;
	
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

	
	
	
	public int getLeadUid() {
		return leadUid;
	}

	public void setLeadUid(int leadUid) {
		this.leadUid = leadUid;
	}

	public int getCustomerUid() {
		return customerUid;
	}

	public void setCustomerUid(int customerUid) {
		this.customerUid = customerUid;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLeadSource() {
		return leadSource;
	}

	public void setLeadSource(String leadSource) {
		this.leadSource = leadSource;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public int getNOTE() {
		return NOTE;
	}

	public void setNOTE(int nOTE) {
		NOTE = nOTE;
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
