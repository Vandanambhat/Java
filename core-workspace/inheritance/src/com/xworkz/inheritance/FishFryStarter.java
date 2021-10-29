package com.xworkz.inheritance;

import com.xworkz.inheritance.aquarium.Fish;
import com.xworkz.inheritance.aquarium.GoldFish;
import com.xworkz.inheritance.aquarium.SharkFish;

public class FishFryStarter {

	public static void main(String[] args) {

		Fish fish = new Fish();
		System.out.println(fish.alive);
		if (fish.alive = true) {
			System.out.println("Fish is alive");
		} else {
			System.out.println("Fish is not alive");
		}
		System.out.println(fish.region);
		System.out.println("#################");

		SharkFish sharkFish = new SharkFish();
		System.out.println(sharkFish.height);
		System.out.println(sharkFish.weight);
		System.out.println("#################");

		GoldFish goldFish = new GoldFish();
		System.out.println(goldFish.color);//GoldFish class
		System.out.println(goldFish.size);//GoldFish class
		System.out.println("#################");
		

		Fish sharkFish1 = new SharkFish();
		System.out.println(sharkFish1.alive);//Fish class
		System.out.println(sharkFish1.region);//Fish class
//		System.out.println(sharkFish1.height);//error
		System.out.println("#################");

		Fish goldFish1 = new GoldFish();
		System.out.println(goldFish1.alive);//Fish class
		System.out.println(goldFish1.region);//Fish class
//		System.out.println(goldFish1.color);//error
//		System.out.println(goldFish1.height);//error
		System.out.println("#################");

		SharkFish goldFish2 = new GoldFish();
		System.out.println(goldFish2.alive);//Fish class
		System.out.println(goldFish2.region);//Fish class
		System.out.println(goldFish2.height);//SharkFish class
		System.out.println(goldFish2.weight);//SharkFish class
		System.out.println("#################");

	}// end of main

}// end of class
