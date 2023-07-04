package com.jbk.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Country {
@Id
private long cId;
private String cName;
public Country() {
	super();
}
public Country(long cId, String cName) {
	super();
	this.cId = cId;
	this.cName = cName;
}
public long getcId() {
	return cId;
}
public void setcId(long cId) {
	this.cId = cId;
}
public String getcName() {
	return cName;
}
public void setcName(String cName) {
	this.cName = cName;
}
@Override
public String toString() {
	return "Country [cId=" + cId + ", cName=" + cName + "]";
}


}
