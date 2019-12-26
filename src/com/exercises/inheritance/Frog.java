package com.exercises.inheritance;

class Amphibian {
	
	public void swim(){
		System.out.println("Swim");
	}
	public void layEggs(){
		System.out.println("Lay Eggs");
	}
	public void liveOnLandAndWater(){
		System.out.println("Can Live on Land and Water");
	}
	private void secretMethod() {
		System.out.println("Not sharing");
	}
	
}

public class Frog extends Amphibian {
	
	public void swim(){
		System.out.println("Frog Swims");
	}
	public void layEggs(){
		System.out.println("Frog Lays Eggs");
	}
	public void liveOnLandAndWater(){
		System.out.println("Frog Can Live on Land and Water");
	}
	public void croaks(){
		System.out.println("Croak");
	}

	public static void main (String[] args){
		Amphibian frog = new Frog();
		frog.swim();
		frog.layEggs();
		frog.liveOnLandAndWater();
	}
}
