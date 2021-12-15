package com.xworkz.collections.methods;

public final class PlaceScanner {

	public static void main(String[] args) {

		PlaceDAO dao = new PlaceDAO();
		dao.save("Begaluru");
		dao.save("Shivamogga");
		dao.save("Mangaluru");
		dao.save("Hasan");
		dao.save("Mysore");
		dao.save("Bidar");

		boolean matched = dao.findMatching("Hasan");
		System.out.println(matched);

		matched = dao.findMatchingCaseInsensitive("MYSORE");
		System.out.println(matched);

		matched = dao.findMatchingStartsWithChars("Bi");
		System.out.println(matched);

		matched = dao.findMatchingEndsWithChars("ar");
		System.out.println(matched);
	}

}
