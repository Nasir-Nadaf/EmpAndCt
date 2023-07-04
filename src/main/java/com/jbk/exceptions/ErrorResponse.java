package com.jbk.exceptions;

import java.util.Date;

public class ErrorResponse {
String msg;
Date date;
public ErrorResponse() {
	super();
}
public ErrorResponse(String msg, Date date) {
	super();
	this.msg = msg;
	this.date = date;
}
public String getMsg() {
	return msg;
}
public void setMsg(String msg) {
	this.msg = msg;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
}
