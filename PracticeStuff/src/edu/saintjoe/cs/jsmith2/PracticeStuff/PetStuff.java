package edu.saintjoe.cs.jsmith2.PracticeStuff;

public class PetStuff {
	private String name;
	private int age;
	private int petClass; // 1 = dog, 2 = cat, 3 = parakeet
	
	// Constructor
	
	public PetStuff(String petName, int petAge, int thisPetClass) {
		name = petName;
		age = petAge;
		petClass = thisPetClass;
		
	}
	Public String toString() {
		return "Pet Class: " + petClass + " is named"
	}

}
