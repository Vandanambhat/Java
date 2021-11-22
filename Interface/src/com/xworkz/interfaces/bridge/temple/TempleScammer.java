package com.java.interfaces.bridge.temple;

public class TempleScammer {

	public static void main(String[] args) {

		DevoteeRule devotee = new PublicDevoteeRule();

		TempleAssociation templeAssociation = new TempleAssociation(devotee, "Isckon");// 11 methods
		templeAssociation.allowDevoteeRule();

	}

}
