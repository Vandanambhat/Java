package com.xworkz.collections.methods;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CountryDAO {

	private Collection<String> country = new ArrayList<String>();

	public boolean save(String country) {
		return this.country.add(country);

	}

	public boolean findMatching(String Name) {
		if (Name != null) {
			if (this.country.contains(Name)) {
				System.out.println("Name is matched");
				return true;
			}
		}
		return false;
	}

	public boolean findMatchingStartsWithChars(String arg) {

		Iterator<String> itr = this.country.iterator();

		while (itr.hasNext()) {

			String element = itr.next();
			if (element.toUpperCase().startsWith(arg.toUpperCase())) {
				return true;
			}
		}
		return false;
	}

	public boolean findMatchingCaseInsensitive(String arg) {
		Iterator<String> itr = this.country.iterator();

		while (itr.hasNext()) {
			String element = itr.next();
			if (element.equalsIgnoreCase(element)) {
				return true;
			}
		}
		return false;

	}

	public boolean findMatchingEndsWithChars(String args) {
		Iterator<String> itr = this.country.iterator();

		while (itr.hasNext()) {

			String element = itr.next();
			if (element.toUpperCase().endsWith(args.toUpperCase())) {
				return true;
			}
		}
		return false;

	}

	
}
