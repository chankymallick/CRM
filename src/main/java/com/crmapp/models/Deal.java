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

@Entity(name="DEAL")
public class Deal {	
    public Deal(){
    	
    }
    
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="DEAL_UID")
	private int dealUid; 
		
	@Column(name="CUSTOMER_ID")
	private int customerId; 
	
	@Column(length=30,name="SERVICE_OPTED",nullable=false)
	private String serviceOpted; 
	
	@Column(name="DEAL_AMOUNT",nullable=false)
	private int dealAmount; 
	
	@Column(length=50,name="DEAL_STAGE",nullable=false)
	private String dealStage; 
	
	@Column(length=50,name="PAYMENT_STATUS",nullable=false)
	private String paymentStatus; 	
	
	@Column(length=50,name="PAYMENT_TYPE",nullable=false)
	private String paymentType; 	
	
	@Column(name="PAYMENT_DATE",nullable=true)
	private Date paymentDate; 
	
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

	public int getDealUid() {
		return dealUid;
	}

	public void setDealUid(int dealUid) {
		this.dealUid = dealUid;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getServiceOpted() {
		return serviceOpted;
	}

	public void setServiceOpted(String serviceOpted) {
		this.serviceOpted = serviceOpted;
	}

	public int getDealAmount() {
		return dealAmount;
	}

	public void setDealAmount(int dealAmount) {
		this.dealAmount = dealAmount;
	}

	public String getDealStage() {
		return dealStage;
	}

	public void setDealStage(String dealStage) {
		this.dealStage = dealStage;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public Date getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
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
