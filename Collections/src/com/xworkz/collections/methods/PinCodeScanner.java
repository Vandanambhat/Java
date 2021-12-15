package com.xworkz.collections.methods;

public class PinCodeScanner {

	public static void main(String[] args) {

		PInCodeDAO dao = new PInCodeDAO();
		dao.save(234567);
		dao.save(978567);
		dao.save(024735);
		dao.save(929835);
		dao.save(903493);
		dao.save(827482);

		boolean matched = dao.findMatching(234567);
		System.out.println(matched);

		matched = dao.findMatchingStartsWithChars(92);
		System.out.println(matched);

		matched = dao.findMatchingEndsWithChars(11);
		System.out.println(matched);

	}

}
