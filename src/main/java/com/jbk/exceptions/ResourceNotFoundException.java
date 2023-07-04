package com.jbk.exceptions;

public class ResourceNotFoundException extends RuntimeException {
	private String msg;

	public ResourceNotFoundException(String msg) {
		super(msg);
		this.msg = msg;
	}

}
