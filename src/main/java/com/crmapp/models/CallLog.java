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

@Entity(name="CALL_LOG")
public class CallLog {
	
    public CallLog() {
		
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="CALL_UID")
	private int callUid;	
	
	@Column(name="CUSTOMER_ID",nullable=false)
	private int customerId;
	
	@Column(length=30,name="CALL_TYPE",nullable=false)
	private String callType;
	
	@Column(length=30,name="CALL_DETAILS",nullable=true)
	private String callDetails;	
	
	@Column(length=30,name="CALL_DATE_TIME",nullable=false)
	private Date callTime;
	
	@Column(name="CALL_DURATION_MIN",nullable=true)
	private int callDurationMinute;
	
	@Column(name="CALL_DURATION_SEC",nullable=true)
	private int callDurationSecond;
	
	@Column(length=50,name="CALL_RESULT",nullable=true)
	private String callResult;
	
	@Column(length=1000,name="DESCRIPTION",nullable=true)
	private String description;	
	
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

	
	
	public int getCallUid() {
		return callUid;
	}

	public void setCallUid(int callUid) {
		this.callUid = callUid;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCallType() {
		return callType;
	}

	public void setCallType(String callType) {
		this.callType = callType;
	}

	public String getCallDetails() {
		return callDetails;
	}

	public void setCallDetails(String callDetails) {
		this.callDetails = callDetails;
	}

	public Date getCallTime() {
		return callTime;
	}

	public void setCallTime(Date callTime) {
		this.callTime = callTime;
	}

	public int getCallDurationMinute() {
		return callDurationMinute;
	}

	public void setCallDurationMinute(int callDurationMinute) {
		this.callDurationMinute = callDurationMinute;
	}

	public int getCallDurationSecond() {
		return callDurationSecond;
	}

	public void setCallDurationSecond(int callDurationSecond) {
		this.callDurationSecond = callDurationSecond;
	}

	public String getCallResult() {
		return callResult;
	}

	public void setCallResult(String callResult) {
		this.callResult = callResult;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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
