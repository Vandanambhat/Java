package com.xworkz.crud.island;

import com.xworkz.crud.island.IslandAdd.AddIsland;

public class IslandStarter {

	public static void main(String[] args) {
		AddIsland land = new AddIsland();
		String is = land.getIslancountry();
		System.out.println(is);
		land.addIsland("Bahamas");
		land.addIsland("Bahrain");
		land.addIsland("Antigua and Barbuda");
		land.addIsland("Cuba");
		land.addIsland("Singapore");
		land.displayisland();
	}

}
