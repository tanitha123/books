package com.hcl.exceptionhandler;

public class Exceptions extends Exception {

	private static final long serialVersionUID = 1L;

	public Exceptions(String message) {
		super(message);
	}
public Exceptions(String message,Throwable cause){
	super(message,cause);
}
}
