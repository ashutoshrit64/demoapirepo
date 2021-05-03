package com.bridgelabz.demo5.exception;

public class RegisterException extends RuntimeException {
	private int statusCode;
	private String statusMessage;
	public RegisterException(int statusCode, String statusMessage) {
		super(statusMessage);
		this.statusCode = statusCode;
		this.statusMessage = statusMessage;
	}
 

}
