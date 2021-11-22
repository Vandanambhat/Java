package com.xworkz.inheritance;

import com.xworkz.inheritance.device.Ipod;

public class IpodScammer {

	public static void main(String[] args) {

		Ipod ipod = new Ipod();
		System.out.println(ipod);
		System.out.println(ipod.toString());
		System.out.println(ipod.hashCode());
		System.out.println(System.identityHashCode(ipod));

		Ipod ipod1 = new Ipod();
		System.out.println(ipod1);
		System.out.println(ipod1.toString());
		System.out.println(ipod1.hashCode());
		System.out.println(System.identityHashCode(ipod1));
		
		ipod.setModelNo("HD90119");
		ipod1.setModelNo("HD90119");
		ipod.equals(ipod1);
	}

}
