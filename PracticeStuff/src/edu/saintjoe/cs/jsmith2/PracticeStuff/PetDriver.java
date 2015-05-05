package edu.saintjoe.cs.jsmith2.PracticeStuff;

public class PetDriver {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pet testPet = new Pet();
		System.out.println(testPet.toString());
		Pet dog = new Pet("Dog", "German Shepherd", "Brown and Black");
		System.out.println(dog.toString());
		Pet cat = new Pet("Cat", "Who cares? It's a cat...");
		System.out.println(cat.toString());
		Pet chicken = new Pet("Chicken");
		System.out.println(chicken.toString());
	}


}
