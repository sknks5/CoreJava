package com.exercises.polymorphism;

abstract class Animal{
	
	Animal(){
		print();
	}
	
	abstract void print();
}

class Lion extends Animal{
	private int age = 1;
	
	public void print(){
		System.out.println("Age of lion = " + age);
	}
}

public class TestAnimal {
	
	public static void main(String[] args){
		Animal lion = new Lion();
		lion.print();
	}

}
