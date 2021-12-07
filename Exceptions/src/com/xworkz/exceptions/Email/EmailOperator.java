package com.xworkz.exceptions.Email;

public class EmailOperator {

	private String[] emailOperator = new String[5];
	private int count = 0;

	public void save(String emailOperator) throws EmailValidationException, StorageFullRunTimeException {
		System.out.println("Invoked save method");
		if (emailOperator != null && count < this.emailOperator.length) {
			if (emailOperator.contains("@") && emailOperator.endsWith(".com") || emailOperator.endsWith(".in") || emailOperator.endsWith(".org")) {
				this.emailOperator[count++] = emailOperator;
				System.out.println("valid email ID");
			}
			else {
				throw new EmailValidationException("Enter the valid email");
			}
		}
		else {
			throw new StorageFullRunTimeException("Storage is full, give proper values");
		}
	}
}
