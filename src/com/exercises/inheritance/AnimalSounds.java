package com.exercises.inheritance;

public class AnimalSounds {
	
	public static void main(String[] args){

		
		Animal animal = new Animal();
		Animal.staticMethod();
		animal.animalSound(); //animalSound of Animal class is called
		
		Animal pig = new Pig();
		pig.animalSound(); //animalSound of Pig class is called, although pig is of type Animal (parent)
		pig.animalCries(); //animalCries of Pig class is called, although pig is of type Animal (parent)
		
		Animal dog = new Dog();
		dog.animalSound(); //animalSound of Dog class is called, although dog is of type Animal (parent)
		dog.animalCries();	//animalCries of Animal class is called, Since Dog class doesn't have animalCries. Dog class inherits animalCries from Parent (Animal)
		
	}

}

class Animal {
	
	  public static void staticMethod(){
		  System.out.println("Static method in animal class loaded");
	  }
	  public void animalSound() {
	    System.out.println("The animal makes a sound");
	  }
	  public void animalCries(){
		  System.out.println("Animal doesn't know how to cry");
	  }
	  static{
		  System.out.println("STATIC ANONYMOUS METHOD");
	  }
	}

	class Pig extends Animal {
	  public void animalSound() {
	    System.out.println("The pig says: wee wee");
	  }
	  public void animalCries(){
		  System.out.println("Woo Woo");
	  }
	  
	}

	class Dog extends Animal {
	  public void animalSound() {
	    System.out.println("The dog says: bow wow");
	  }
	} 
