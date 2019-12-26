package com.exercises.inheritance;

class Circle {
	
	Circle(){
		System.out.println("Constructing a circle with no radius");
		draw();
		System.out.println("Done with drawing a circle");		
	}
	public void draw(){
		System.out.println("Drawing a circle");
	}
}

class BigCircle extends Circle{
	private int radius = 1;
	BigCircle(int radius){
		this.radius = radius;		
		draw();	
	}
	public void draw(){
		System.out.println("Drawing a circle with radius = " + radius);
	}	
}

public class BadInitializationConstructor {
	public static void main(String[] args){
		Circle circle = new BigCircle(5);
	}

}
