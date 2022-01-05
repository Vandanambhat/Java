package com.xworkz.collections.options;

import java.util.Optional;
import java.util.stream.Stream;

public class OptionalScanner {

	public static void main(String[] args) {

//		Optional<String> optionalValue = getValue();
		Stream<Object> optional = Stream
				.of("Vidit aatrey","Sundar Pichal","Shashank Kumar","Sachin Bansal","Elon Musk")
				.filter((e)->e.startsWith("S"))
				.map((e)->e.toUpperCase());
		if (optional.isPresent()) {
			System.out.println("Optioanal value is present");
			String str = optionalValue.get();
			System.out.println(str.toUpperCase());
		}
//		String str=getValue();
//		if(str!=null) {
//			System.out.println(str.toUpperCase());
//		}
	}

	public static Optional<String> getValue() {
		Optional<String> value = Optional.of("Very Cold");
//		Optional<String> value = Optional.ofNullable(null);
		return value;

	}

//	public static String getValue() {
//
//		return null;
//
//	}
}
