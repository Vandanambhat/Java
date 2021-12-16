package com.xworkz.collections.FunctionalInterface.biscuit;

public class BiscuitScanner {

	public static void main(String[] args) {
		BiscuitDAO beerDAO = new BiscuitDAO();

		BiscuitSearch beerSearch = new EqualsBiscuitSearch();
		boolean result = beerDAO.find(beerSearch, "Parle-G");
		System.out.println(result);

		BiscuitSearch beerSearch1 = new EqualsIgnoreCaseBiscuitSearch();
		boolean result1 = beerDAO.find(beerSearch1, "maska-chaska");
		System.out.println(result1);

	}

}
