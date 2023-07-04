package com.jbk.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Registration {
	@Id
	@GeneratedValue
	long id;
	
	String username;
	String password;
	@Column(unique = true)
	String emailId;
	String mobileNo;
	String gender;
	Date createdDate;
	public Registration() {
		super();
	}
	public Registration(long id, String username, String password, String emailId, String mobileNo, String gender,
			Date createdDate) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.emailId = emailId;
		this.mobileNo = mobileNo;
		this.gender = gender;
		this.createdDate = createdDate;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	
}
