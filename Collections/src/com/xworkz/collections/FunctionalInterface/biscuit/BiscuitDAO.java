package com.xworkz.collections.FunctionalInterface.biscuit;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class BiscuitDAO {

	private Collection<String> biscuitcollection = new ArrayList<String>();

	public BiscuitDAO() {

		biscuitcollection.add("Parle-G");
		biscuitcollection.add("Burboun");
		biscuitcollection.add("50-50");
		biscuitcollection.add("Maska-Chaska");
		biscuitcollection.add("Britania");
		biscuitcollection.add("Good-Day");
		biscuitcollection.add("MariGold");
		biscuitcollection.add("Nutrichoice");
		biscuitcollection.add("30-30");
		biscuitcollection.add("20-20");
	}

	public boolean find(BiscuitSearch search, String value) {
		Iterator<String> itr = this.biscuitcollection.iterator();
		while (itr.hasNext()) {
			String element = (String) itr.next();
			if (search.expressions(element, value)) {
				return true;
			}
		}
		return false;

	}

}
