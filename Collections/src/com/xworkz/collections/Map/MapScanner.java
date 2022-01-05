package com.xworkz.collections.Map;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapScanner {

	public static void main(String[] args) {

		Map<String, String> nameAndPlaceMap = new HashMap<String, String>();
		//Map<Key,Value>
		nameAndPlaceMap.put("Megha", "Davanagere");//<Key,Value>
		nameAndPlaceMap.put("Vandana", "Shivamogga");
		nameAndPlaceMap.put("Mustaq", "Ballary");
		nameAndPlaceMap.put("Savita", "Bengaluru");
		nameAndPlaceMap.put("Shivasai", "Bidar");
		nameAndPlaceMap.put("Abhijeet", "Aurangabad");

		Set<String> set = nameAndPlaceMap.keySet();
		
		set.stream().map((e)->e.toUpperCase()).forEach((e) -> System.out.println(e));/*map method is different and Map Interface is different
		Map Interface : It will return Set
		while map method used while performing stream operations*/
		
		set.stream().sorted(Comparator.reverseOrder()).forEach((k) -> System.out.println(k));// sorts the keys in
																								// the reverse order

		System.out.println(System.lineSeparator());

		Collection<String> collection = nameAndPlaceMap.values();// gives only values

		collection.forEach((v) -> System.out.println(v));

		System.out.println(System.lineSeparator());

		Set<Map.Entry<String, String>> entrySet = nameAndPlaceMap.entrySet();

		Iterator<Map.Entry<String, String>> itr = entrySet.iterator();//reading entries using the iterator

		while (itr.hasNext()) {
			Map.Entry<String, String> element = itr.next();
			System.out.println(element.getKey().concat(" ").concat(element.getValue()));
		}

//		System.out.println(System.lineSeparator());
//
//		entrySet.forEach((entry) -> System.out.println(entry.getKey().concat(" ").concat(entry.getValue())));//reading entries using the forEach
	}

}
