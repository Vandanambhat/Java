package com.xworkz.collections.FunctionalInterface.paint;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.xworkz.collections.FunctionalInterface.biscuit.BiscuitSearch;

public class PaintDAO {

	private Collection<String> paintCollection = new ArrayList<String>();

	public PaintDAO() {

		paintCollection.add("Parle-G");
		paintCollection.add("Burboun");
		paintCollection.add("50-50");
		paintCollection.add("Maska-Chaska");
		paintCollection.add("Britania");
		paintCollection.add("Good-Day");
		paintCollection.add("MariGold");
		paintCollection.add("Nutrichoice");
		paintCollection.add("30-30");
		paintCollection.add("20-20");
	}

	public boolean find(PaintSearch search, String value) {
		Iterator<String> itr = this.paintCollection.iterator();
		while (itr.hasNext()) {
			String element = (String) itr.next();
			if (search.expressions(element, value)) {
				return true;
			}
		}
		return false;

	}
	
}
