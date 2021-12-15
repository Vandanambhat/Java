package com.xworkz.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.xworkz.collections.FunctionalInterface.BeerSearch;

public class BeerDAO {

	private Collection<String> beercollection = new ArrayList<String>();

	public BeerDAO() {

		beercollection.add("Beer1");
		beercollection.add("Beer2");
		beercollection.add("Beer3");
		beercollection.add("Beer4");
		beercollection.add("Beer5");
		beercollection.add("Beer6");
		beercollection.add("Beer7");
		beercollection.add("Beer8");
		beercollection.add("Beer9");
		beercollection.add("Beer10");
	}

	public boolean find(BeerSearch search, String value) {
		Iterator<String> itr = this.beercollection.iterator();
		while (itr.hasNext()) {
			String element = (String) itr.next();
			if (search.expressions(element, value)) {
				return true;
			}
		}
		return false;

	}

}
