package com.xworkz.inheritance;

import com.xworkz.inheritance.RiverFlow.KaveriRiver;
import com.xworkz.inheritance.RiverFlow.KrishnaRiver;
import com.xworkz.inheritance.RiverFlow.River;

public class RiverStarter {

	public static void main(String[] args) {
		
		
		Object object = new River();
		
		River river1 = (River) object;
		System.out.println(river1.destination);
		System.out.println(river1.name);
		System.out.println(river1.origin);
		System.out.println(river1.length);
		System.out.println("---------------------------------");
		
		Object kaveriRiver1=new KaveriRiver();
		
		KaveriRiver kaveri=(KaveriRiver)kaveriRiver1;
		System.out.println(kaveri.sweet);//Kaveri River
		System.out.println(kaveri.origin);
		System.out.println(kaveri.destination);
		System.out.println(kaveri.name);
		System.out.println(kaveri.length);
		System.out.println("---------------------------------");
		
		Object krishnaRiver1=new KrishnaRiver();
		KrishnaRiver krishna1=(KrishnaRiver)krishnaRiver1;
		System.out.println(krishna1.noOfDams);//krishna River
		System.out.println(krishna1.length);
		System.out.println(krishna1.destination);
		System.out.println(krishna1.name);
		System.out.println(krishna1.origin);
		System.out.println("---------------------------------");
		
		River krishnaRiver=new KrishnaRiver();
		KrishnaRiver krishna=(KrishnaRiver)krishnaRiver;
		System.out.println(krishna.noOfDams);
		System.out.println(krishna.length);
		System.out.println(krishna.destination);
		System.out.println(krishna.name);
		System.out.println(krishna.origin);
		System.out.println("---------------------------------");
		
		River river = new KaveriRiver();
//		KaveriRiver kaveriRiver = (KaveriRiver) river;//write like this 
//		System.out.println(kaveriRiver.sweet);
//		System.out.println(kaveriRiver.destination);
//		System.out.println(kaveriRiver.length);
//		System.out.println(kaveriRiver.name);
//		System.out.println(kaveriRiver.origin);
		if(river instanceof KaveriRiver) { //or use this it will be more effient
			System.out.println("Kaveri River Using Instanceof");
			KaveriRiver kaveriRiver = (KaveriRiver) river;
			System.out.println(kaveriRiver.sweet);
			System.out.println(kaveriRiver.destination);
			System.out.println(kaveriRiver.length);
			System.out.println(kaveriRiver.name);
			System.out.println(kaveriRiver.origin);
		}
		System.out.println("---------------------------------");
		River krishnaRiver2=new KrishnaRiver();
		if(river instanceof KrishnaRiver) {
			System.out.println("Krishna River Using Instanceof");
			KrishnaRiver krihsnaR=(KrishnaRiver)krishnaRiver2;
			System.out.println(krihsnaR.noOfDams);
			System.out.println(krihsnaR.length);
			System.out.println(krihsnaR.destination);
			System.out.println(krihsnaR.name);
			System.out.println(krihsnaR.origin);
		}
		
	}

}
