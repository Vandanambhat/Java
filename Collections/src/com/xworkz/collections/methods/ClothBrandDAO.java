package com.xworkz.collections.methods;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ClothBrandDAO {

	private Collection<String> fruits = new ArrayList<String>();

	public boolean save(String fruit) {
		return this.fruits.add(fruit);

	}

	public boolean findMatching(String Name) {
		if (Name != null) {
			if (this.fruits.contains(Name)) {
				System.out.println("Name is matched");
				return true;
			}
		}
		return false;
	}

	public boolean findMatchingStartsWithChars(String arg) {

		Iterator<String> itr = this.fruits.iterator();

		while (itr.hasNext()) {

			String element = itr.next();
			if (element.toUpperCase().startsWith(arg.toUpperCase())) {
				return true;
			}
		}
		return false;
	}

	public boolean findMatchingCaseInsensitive(String arg) {
		Iterator<String> itr = this.fruits.iterator();

		while (itr.hasNext()) {
			String element = itr.next();
			if (element.equalsIgnoreCase(element)) {
				return true;
			}
		}
		return false;

	}

	public boolean findMatchingEndsWithChars(String args) {
		Iterator<String> itr = this.fruits.iterator();

		while (itr.hasNext()) {

			String element = itr.next();
			if (element.toUpperCase().endsWith(args.toUpperCase())) {
				return true;
			}
		}
		return false;

	}

}
