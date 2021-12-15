package com.xworkz.collections.methods;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ClothBrandsDAO {

	private Collection<String> cloths = new ArrayList<String>();

	public boolean save(String cloth) {
		return this.cloths.add(cloth);

	}

	public boolean findMatching(String clothName) {
		if (clothName != null) {
			if (this.cloths.contains(clothName)) {
				System.out.println("Name is matched");
				return true;
			}
		}
		return false;
	}

	public boolean findMatchingStartsWithChars(String arg) {

		Iterator<String> itr = this.cloths.iterator();

		while (itr.hasNext()) {

			String element = itr.next();
			if (element.toUpperCase().startsWith(arg.toUpperCase())) {
				return true;
			}
		}
		return false;
	}

	public boolean findMatchingCaseInsensitive(String arg) {
		Iterator<String> itr = this.cloths.iterator();

		while (itr.hasNext()) {
			String element = itr.next();
			if (element.equalsIgnoreCase(element)) {
				return true;
			}
		}
		return false;

	}

	public boolean findMatchingEndsWithChars(String args) {
		Iterator<String> itr = this.cloths.iterator();

		while (itr.hasNext()) {

			String element = itr.next();
			if (element.toUpperCase().endsWith(args.toUpperCase())) {
				return true;
			}
		}
		return false;

	}

}
