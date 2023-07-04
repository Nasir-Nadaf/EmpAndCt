package com.jbk.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Employee {
@Id
@GeneratedValue
private long empId;
private String empName;
private String department;
private String status;
private long empMob;
private String emailId;
private Date createdDate;
private String createdBy;
private Date updatedDate;
private String updatedBy;

@OneToOne
private Country country;

public Employee() {
	super();
}

public Employee(long empId, String empName, String department, String status, long empMob, String emailId,
		Date createdDate, String createdBy, Date updatedDate, String updatedBy, Country country) {
	super();
	this.empId = empId;
	this.empName = empName;
	this.department = department;
	this.status = status;
	this.empMob = empMob;
	this.emailId = emailId;
	this.createdDate = createdDate;
	this.createdBy = createdBy;
	this.updatedDate = updatedDate;
	this.updatedBy = updatedBy;
	this.country = country;
}

public long getEmpId() {
	return empId;
}

public void setEmpId(long empId) {
	this.empId = empId;
}

public String getEmpName() {
	return empName;
}

public void setEmpName(String empName) {
	this.empName = empName;
}

public String getDepartment() {
	return department;
}

public void setDepartment(String department) {
	this.department = department;
}

public String getStatus() {
	return status;
}

public void setStatus(String status) {
	this.status = status;
}

public long getEmpMob() {
	return empMob;
}

public void setEmpMob(long empMob) {
	this.empMob = empMob;
}

public String getEmailId() {
	return emailId;
}

public void setEmailId(String emailId) {
	this.emailId = emailId;
}

public Date getCreatedDate() {
	return createdDate;
}

public void setCreatedDate(Date createdDate) {
	this.createdDate = createdDate;
}

public String getCreatedBy() {
	return createdBy;
}

public void setCreatedBy(String createdBy) {
	this.createdBy = createdBy;
}

public Date getUpdatedDate() {
	return updatedDate;
}

public void setUpdatedDate(Date updatedDate) {
	this.updatedDate = updatedDate;
}

public String getUpdatedBy() {
	return updatedBy;
}

public void setUpdatedBy(String updatedBy) {
	this.updatedBy = updatedBy;
}

public Country getCountry() {
	return country;
}

public void setCountry(Country country) {
	this.country = country;
}

@Override
public String toString() {
	return "Employee [empId=" + empId + ", empName=" + empName + ", department=" + department + ", status=" + status
			+ ", empMob=" + empMob + ", emailId=" + emailId + ", createdDate=" + createdDate + ", createdBy="
			+ createdBy + ", updatedDate=" + updatedDate + ", updatedBy=" + updatedBy + ", country=" + country + "]";
}



}
