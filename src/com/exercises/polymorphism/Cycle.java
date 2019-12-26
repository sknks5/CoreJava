package com.exercises.polymorphism;

public class Cycle {
	public String name = "Cycle";

	public String getName() {
		return name;
	}
	public static int getCount(){
		System.out.println("In Cycle super class");
		return 1;
	}
	
	public void ride() {
		System.out.println("Riding a cycle");
	}

	public static void testDrive(Cycle cycle){
		cycle.ride();
	}
	public static int getWheels(Cycle cycle){
		return cycle.wheelCount();
	}
	public int wheelCount(){
		return 0;
	}
	public void balance() {
		System.out.println("Balance a bike");
	}
	

	public static void main(String[] args){
		Cycle myCycle = new UniCycle();
		System.out.println("Name = " + myCycle.name);
		testDrive(myCycle);
		System.out.println("Number of wheels = " + getWheels(myCycle));
		myCycle.getCount();
		
		System.out.println("\nupcasting BiCycle to Cycle reference");
		Cycle bic = new BiCycle();
		bic.getCount();//static class will not behave polymorphically. Cycle's static method called
		bic.ride();
		
		System.out.println("\nupcasting TriCycle to Cycle reference");
		Cycle tryc = new TriCycle();
		tryc.getCount();//static class will not behave polymorphically. Cycle's static method called
		tryc.ride();
		
		System.out.println("Creating an array of cycles");
		Cycle[] manyCycles = {new UniCycle(), new BiCycle(), new TriCycle()};
		
		testDrive(manyCycles[0]);
		testDrive(manyCycles[1]);
		testDrive(manyCycles[2]);
		
		manyCycles[0].balance();
		manyCycles[1].balance();
		manyCycles[2].balance();
		
		((UniCycle)manyCycles[0]).balance();
		((BiCycle)manyCycles[1]).balance();
		((TriCycle)manyCycles[2]).balance();
		
		
	}	
}

class UniCycle extends Cycle {

	public void ride() {
		System.out.println("Quite hard to ride a bike with ONE wheel");
	}
	public int wheelCount(){
		return 1;
	}
	public String getName() {
		return name;
	}
	public static int getCount(){
		System.out.println("In UniCycle class");
		return 1;
	}
	public void balance() {
		System.out.println("Very hard to learn Balancing bike with ONE wheel");
	}

	
	
	
}

class BiCycle extends Cycle {
	public void ride() {
		System.out.println("Feel old enough to ride a cycle with TWO wheels");
	}
	public int wheelCount(){
		return 2;
	}
	
	public String getName() {
		return name;
	}
	public static int getCount(){
		System.out.println("In BiCycle class");
		return 1;
	}
	public void balance() {
		System.out.println("Still hard to balance on TWO wheel, but easier to learn than the one with ONE wheel");
	}
	
	
	
	
}

class TriCycle extends Cycle {
	public void ride() {
		System.out.println("Sweet! Stable, but can not remember when I rode this one with THREE wheels");
	}
	public int wheelCount(){
		return 3;
	}
	public String getName() {
		return name;
	}	
	public static int getCount(){
		System.out.println("In TriCycle class");
		return 1;
	}
	public void balance() {
		System.out.println("Easy to Balance a tryc");
	}
	
	
}