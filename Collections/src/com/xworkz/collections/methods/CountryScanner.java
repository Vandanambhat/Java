package com.xworkz.collections.methods;

public class CountryScanner {

	public static void main(String[] args) {

		CountryDAO dao = new CountryDAO();
		dao.save("India");
		dao.save("Korea");
		dao.save("Pakisthan");
		dao.save("UAE");
		dao.save("Germany");
		dao.save("Scottland");

		boolean matched = dao.findMatching("pak");
		System.out.println(matched);

		matched = dao.findMatchingCaseInsensitive("INDIA");
		System.out.println(matched);

		matched = dao.findMatchingStartsWithChars("ea");
		System.out.println(matched);

		matched = dao.findMatchingEndsWithChars("land");
		System.out.println(matched);
	}

}
