package com.xworkz.collections.methods;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class PlaceDAO {

	private Collection<String> places = new ArrayList<String>();

	public boolean save(String place) {
		return this.places.add(place);

	}

	public boolean findMatching(String Name) {
		if (Name != null) {
			if (this.places.contains(Name)) {
				System.out.println("Name is matched");
				return true;
			}
		}
		return false;
	}

	public boolean findMatchingStartsWithChars(String arg) {

		Iterator<String> itr = this.places.iterator();

		while (itr.hasNext()) {

			String element = itr.next();
			if (element.toUpperCase().startsWith(arg.toUpperCase())) {
				return true;
			}
		}
		return false;
	}

	public boolean findMatchingCaseInsensitive(String arg) {
		Iterator<String> itr = this.places.iterator();

		while (itr.hasNext()) {
			String element = itr.next();
			if (element.equalsIgnoreCase(element)) {
				return true;
			}
		}
		return false;

	}

	public boolean findMatchingEndsWithChars(String args) {
		Iterator<String> itr = this.places.iterator();

		while (itr.hasNext()) {

			String element = itr.next();
			if (element.toUpperCase().endsWith(args.toUpperCase())) {
				return true;
			}
		}
		return false;

	}
}
