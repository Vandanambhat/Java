package com.xworkz.exceptions.Email;

public class EmailValidationException extends Exception{


	public EmailValidationException() {
		System.out.println("Invoked Email Validation Exception");
	}
	
	public EmailValidationException(String msg) {
		super(msg);
	}
}
