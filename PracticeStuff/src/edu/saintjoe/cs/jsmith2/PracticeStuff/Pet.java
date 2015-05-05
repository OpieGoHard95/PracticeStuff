package edu.saintjoe.cs.jsmith2.PracticeStuff;

public class Pet {
	public String animal;
	public String breed;
	public String color;

	Pet() {
		animal = "No animal given";
		breed = "No breed specified";
		color = "No color given";
	}
	
	Pet(String thisAnimal, String thisBreed, String thisColor) {
		animal = thisAnimal;
		breed = thisBreed;
		color = thisColor;
	}
	
	Pet(String thisAnimal, String thisBreed) {
		this();
		animal = thisAnimal;
		breed = thisBreed;
	}
	
	Pet(String thisAnimal) {
		this();
		animal = thisAnimal;
	}

	public String toString() {
	    String output = "";
	    output = "Animal: " + animal + " Breed: " + breed + " Color: " + color;
	    return output;
	    }
}
