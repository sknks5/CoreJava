package com.exercises.polymorphism;


abstract class Vehicle{
	
	abstract public void drive();
	abstract public void fly();
	
}

class Car extends Vehicle{
	
	public void drive(){
		System.out.println("Drive car around the city");
	}	
	public void fly(){
		return;
	}
}

class StarShip extends Vehicle{
	
	public void drive(){
	 return;
	}
	public void fly(){
		System.out.println("Fly around the universe");
	}	
}


public class TestVehicle {
	
	public static void main(String[] args){
		Vehicle v = new Car();
		drive(v);

		Vehicle v1 = new StarShip();
		drive(v1);		
		
	}
	
	public static void drive(Vehicle v){
		if (v instanceof Car) 
		   //((Car) v).drive();
			v.drive();
		else
			//((StarShip) v).fly();
			v.fly();
	}

}
