package com.xworkz.crud.rockets;

import com.xworkz.crud.rockets.rocketAdd.AddRockets;

public class RocketLauncher {

	public static void main(String[] args) {
		AddRockets rock = new AddRockets();
		String r = rock.getRocketName();
		System.out.println(r);
		rock.addRestaurents("PSLV-1");
		rock.addRestaurents("MangalaYaan");
		rock.addRestaurents("rover");
		rock.addRestaurents("Aarya Bhata");
		rock.addRestaurents("chandrayaan");
		rock.displayRestaurents();

	}

}
