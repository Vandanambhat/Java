package com.xworkz.collections.methods;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class PInCodeDAO {
	
	private Collection<Integer> pinCode = new ArrayList<Integer>();

	public boolean save(int pin) {
		return this.pinCode.add(pin);

	}

	public boolean findMatching(Integer pin) {
		if (pin != null) {
			if (this.pinCode.contains(pin)) {
				System.out.println("Pin is matched");
				return true;
			}
		}
		return false;
	}

	public boolean findMatchingStartsWithChars(int arg) {

		Iterator<Integer> itr = this.pinCode.iterator();

		String start=Integer.toString(arg);
		
		while (itr.hasNext()) {

			int element = itr.next();
			String uppi2=Integer.toString(arg);
			if (uppi2.toUpperCase().startsWith(uppi2.toUpperCase())) {
				return true;
			}
		}
		return false;
	}

	public boolean findMatchingEndsWithChars(int args) {
		Iterator<Integer> itr = this.pinCode.iterator();
		String start=Integer.toString(args);
		while (itr.hasNext()) {

			Integer element = itr.next();
			if (element.toUpperCase().endsWith(args.toUpperCase())) {
				return true;
			}
		}
		return false;

	}


}
