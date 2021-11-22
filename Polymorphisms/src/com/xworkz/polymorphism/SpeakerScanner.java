package com.xworkz.polymorphism;

import java.lang.reflect.Method;

public class SpeakerScanner {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {

		Speaker speaker = new Speaker();

		Class clazz = speaker.getClass();
		System.out.println(clazz.getName());// com.xworkz.polymorphism.Speaker
		System.out.println(clazz.getSimpleName());// Speaker
		System.out.println(clazz.getTypeName());// com.xworkz.polymorphism.Speaker
		System.out.println(clazz.getTypeName());// com.xworkz.polymorphism.Speaker
		System.out.println(clazz.getCanonicalName());// com.xworkz.polymorphism.Speaker

		Method[] methods = clazz.getMethods();
		System.out.println(methods.length);//prints the length 
		System.out.println();
		for (int brush = 0; brush < methods.length; brush++) {
			Method method = methods[brush];
			System.out.println(method.getName());
			System.out.println(method.getReturnType());
			System.out.println(method.getParameterCount());
			System.out.println();
		}
	}

}
