package com.xworkz.exceptions.Email;

public class EmailRunner {

	public static void main(String[] args) throws EmailValidationException, StorageFullRunTimeException {
		
		EmailOperator email =new EmailOperator();
		email.save("vandana@gmail.com");
		email.save("vandana@gmail.com");
		email.save("vandana@gmail.com");
		email.save("vandana@gmail.com");
		email.save("vandana@gmail.com");
		email.save("vandana@gmail.com");
		email.save("vandana@gmail.com");
	}

}
