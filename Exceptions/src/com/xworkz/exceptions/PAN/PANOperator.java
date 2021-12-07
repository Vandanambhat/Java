package com.xworkz.exceptions.PAN;

public class PANOperator {

	private String[] panOperator = new String[5];
	private int count = 0;

	public void save(String panOperator) throws PANValidationException {
		System.out.println("Invoked save method");
		if (panOperator != null && count < this.panOperator.length) {
			if (panOperator.contains("@") && panOperator.endsWith(".com") || panOperator.endsWith(".in") || panOperator.endsWith(".org")) {
				this.panOperator[count++] = panOperator;
				System.out.println("valid email ID");
			}
			else {
				throw new PANValidationException("Enter the valid email");
			}
		}
		else {
			throw new StorageFullRunTimeException("Storage is full, give proper values");
		}
	}
	
}
