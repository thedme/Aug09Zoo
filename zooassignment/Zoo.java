package com.zooassignment;

import java.util.ArrayList;

public class Zoo {

	public static void main(String[] args) {
		
		ArrayList<Animal> animalList = new ArrayList<>();
		
		
		Animal monkey1 = new Monkey("Gorilla", 2.5f, "Green", 4,"Monkey", false, true);
		Animal monkey2 = new Monkey("Chimpanzee", 200, "Red", 6,"Monkey", true, false);
		Animal monkey3 = new Monkey("Chimpanzee", 175, "Red", 6, "Monkey",true, false);
		
		Animal elephant1 = new Elephant("wild", 290, "Silver", 6,"Elephant", true, 5);
		Animal elephant2 = new Elephant("wild", 290, "Silver", 6,"Elephant", true, 8);
		Animal elephant3 = new Elephant("wild", 290, "Silver", 6,"Elephant", true, 8);
		
		Animal tiger1 = new Tiger("Madagascaran", 50.0d, "Orange", 5,"Tiger", true);
		Animal tiger2 = new Tiger("Madagascaran", 56.5d, "white", 5,"Tiger", true);
		Animal tiger3 = new Tiger("Madagascaran", 55.0d, "Black", 5,"Tiger", false);
		
		Animal lion1 = new Lion("Safari", 195, "Yellow", 2, "Lion");
		
		Animal coelacanth1 = new Coelacanth("aqua", 0, "red", 1, "Coelacanth", false, true);
		Animal rattleSnake1 = new RattleSnake("breed", 1.0d, "green", 1, "RattleSnake", true, true, true);
		Animal scorpion1 = new Scorpion("breed", 1, "Green", 1, "Scorpion", true, false);
		Animal goldFish1 = new GoldFish("", 1, "Shiny Gold", 1, "GoldFish", true, true);
		Animal chicken1 = new Chicken("", 2, "white", 3, "Chicken");
		Animal squirrel1 = new Squirrel("", 2, "gray", 2, "Squirrel");
		Animal copperhead1 = new Copperhead("", 2, "Brown", 2, "Copperhead", true, true);
		
		
		animalList.add(monkey1);
		animalList.add(monkey2);
		animalList.add(monkey3);
		
		animalList.add(elephant1);
		animalList.add(elephant2);
		animalList.add(elephant3);
		
		animalList.add(tiger1);
		animalList.add(tiger2);
		animalList.add(tiger3);
		
		animalList.add(lion1);
		
		animalList.add(coelacanth1);
		
		animalList.add(rattleSnake1);
		
		animalList.add(scorpion1);
		
		animalList.add(goldFish1);
		
		animalList.add(chicken1);
		
		animalList.add(squirrel1);
		
		animalList.add(copperhead1);
		
		
		
		for(int i=0; i< animalList.size(); i++)
		
		System.out.println("Today at the zoo I saw " + animalList.get(i).toString());
		
		
	}

	

}
