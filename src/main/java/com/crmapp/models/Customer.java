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


@Entity(name="CUSTOMER")
public class Customer {		
	public Customer() {		
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="CUSTOMER_UID")
	private int customerUid;
	
	@Column(length=30,name="FIRST_NAME",nullable=true)
	private String firstname;
	
	@Column(length=30,name="LAST_NAME",nullable=true)
	private String lastname;
	
	@Column(length=30,name="CUSTOMER_STAGE",nullable=false)
	private String customerStage;
	
	@Column(name="ASSIGNED_TO",nullable=true)
	private int assignedTo;
	
	@Column(length=30,name="COUNTRY",nullable=true)
	private String country;
	
	@Column(length=5,name="CURRENCY",nullable=true)
	private String currency;
	
	@Column(name="REVENUE_POTENTIAL",nullable=true)
	private int revenuePotential;
	
	@Column(length=50,name="SERVICE_INTERESTED")	
	private String serviceInterested;
	
	@Column(length=2000, name="DESCRIPTION",nullable=true)
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
	
	

	public int getCustomerUid() {
		return customerUid;
	}

	public void setCustomerUid(int customerUid) {
		this.customerUid = customerUid;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getCustomerStage() {
		return customerStage;
	}

	public void setCustomerStage(String customerStage) {
		this.customerStage = customerStage;
	}

	public int getAssignedTo() {
		return assignedTo;
	}

	public void setAssignedTo(int assignedTo) {
		this.assignedTo = assignedTo;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public int getRevenuePotential() {
		return revenuePotential;
	}

	public void setRevenuePotential(int revenuePotential) {
		this.revenuePotential = revenuePotential;
	}

	public String getServiceInterested() {
		return serviceInterested;
	}

	public void setServiceInterested(String serviceInterested) {
		this.serviceInterested = serviceInterested;
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
