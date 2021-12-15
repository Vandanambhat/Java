package com.xworkz.collections.methods;

public class ClothBrandScanner {

	public static void main(String[] args) {

		ClothBrandDAO dao = new ClothBrandDAO();
		dao.save("Zudio");
		dao.save("PterEngland");
		dao.save("H&M");
		dao.save("Aavaasa");
		dao.save("Levis");
		dao.save("Adidas");

		boolean matched = dao.findMatching("Quio");
		System.out.println(matched);

		matched = dao.findMatchingCaseInsensitive("Adi");
		System.out.println(matched);

		matched = dao.findMatchingStartsWithChars("H");
		System.out.println(matched);

		matched = dao.findMatchingEndsWithChars("asa");
		System.out.println(matched);

	}

}
