package com.xworkz.inheritance;

import com.xworkz.inheritance.device.Aeroplane;

public class AeroplaneScanner {
	

			public static void main(String[] args) {
				Aeroplane airoplane1=new Aeroplane("Air INDIA", 620, "India Govt");
				Aeroplane airoplane2=new Aeroplane("Air INDIA", 620, "India Govt");
				Aeroplane airoplane3=new Aeroplane("Star Links", 2210, "India Govt");
			
			System.out.println(airoplane1.toString());
			System.out.println(airoplane1.hashCode());
			
			System.out.println(airoplane2.toString());
			System.out.println(airoplane2.hashCode());
			
			System.out.println(airoplane3.toString());
			System.out.println(airoplane3.hashCode());
			
			System.out.println(airoplane1.equals(airoplane2)+"\n");
			System.out.println(airoplane1.equals(airoplane3)+"\n");
			System.out.println(airoplane1.equals(null)+"\n");
			System.out.println(airoplane1.equals(21)+"\n");

			}

		}
