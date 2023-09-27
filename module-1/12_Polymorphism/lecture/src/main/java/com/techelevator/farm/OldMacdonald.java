package com.techelevator.farm;

import java.util.ArrayList;
import java.util.List;

public class OldMacdonald {
	public static void main(String[] args) {

		Cow cow = new Cow();
		Chicken chicken = new Chicken();

/*
		String name = cow.getName();
		String sound = cow.getSound();

		System.out.println("Old MacDonald had a farm, ee, ay, ee, ay, oh!");
		System.out.println("And on his farm he had a " + name + ", ee, ay, ee, ay, oh!");
		System.out.println("With a " + sound + " " + sound + " here");
		System.out.println("And a " + sound + " " + sound + " there");
		System.out.println("Here a " + sound + " there a " + sound + " everywhere a " + sound + " " + sound);
		System.out.println();


		Chicken chicken = new Chicken();

		String name = chicken.getName();
		String sound = chicken.getSound();

		System.out.println("Old MacDonald had a farm, ee, ay, ee, ay, oh!");
		System.out.println("And on his farm he had a " + name + ", ee, ay, ee, ay, oh!");
		System.out.println("With a " + sound + " " + sound + " here");
		System.out.println("And a " + sound + " " + sound + " there");
		System.out.println("Here a " + sound + " there a " + sound + " everywhere a " + sound + " " + sound);
		System.out.println();*/

		Tractor myTractor = new Tractor("Vroom Vroom");

		System.out.println("And the sound it makes is.... ");

		Singable[] allSingables = {cow, chicken, myTractor};
		for (Singable singableThing : allSingables) {
			System.out.println("And the sound it makes is.... " + singableThing.getSound());
		}








		//Or we can do
		List<FarmAnimal> allAnimals = new ArrayList<>();

		allAnimals.add(cow);
		allAnimals.add(chicken);


		for (FarmAnimal animal : allAnimals) {
			String name = animal.getName();
			String sound = animal.getSound();


			System.out.println("Old MacDonald had a farm, ee, ay, ee, ay, oh!");
			System.out.println("And on his farm he had a " + name + ", ee, ay, ee, ay, oh!");
			System.out.println("With a " + sound + " " + sound + " here");
			System.out.println("And a " + sound + " " + sound + " there");
			System.out.println("Here a " + sound + " there a " + sound + " everywhere a " + sound + " " + sound);
			System.out.println();
		}




	}

}
