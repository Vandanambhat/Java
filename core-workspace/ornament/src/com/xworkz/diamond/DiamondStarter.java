package com.xworkz.diamond;

import com.xworkz.joyalukas.*;

public class DiamondStarter {

	public static void main(String[] args) {
		
		
		Mine mine=new Mine();
		System.out.println(mine);//toString
		
		Joyalukas joyalukas=new Joyalukas();
		joyalukas.setOwnerName("Diamond Ring");
		System.out.println(joyalukas.ownerName);
	}

}
