package com.xworkz.collections.methods;

public class FruitsScanner {

	public static void main(String[] args) {

		FruitsDAO dao = new FruitsDAO();
		dao.save("Mango");
		dao.save("Apple");
		dao.save("BANANA");
		dao.save("Grapes");
		dao.save("Orange");
		dao.save("Butter Fruit");

		boolean matched = dao.findMatching("Mango");
		System.out.println(matched);

		matched = dao.findMatchingCaseInsensitive("nana");
		System.out.println(matched);

		matched = dao.findMatchingStartsWithChars("O");
		System.out.println(matched);

		matched = dao.findMatchingEndsWithChars("it");
		System.out.println(matched);

	}

}
