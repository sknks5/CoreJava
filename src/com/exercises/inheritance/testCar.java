package com.exercises.inheritance;

public class testCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Parent Car object created from Parent Car Class
		car car = new car();
		car.runs();

		//Child Car object created from Child Car Class		
		raceCar racecar = new raceCar();
		racecar.runs();

		//Child Car object Assigned to Parent Car type	
		car parentcar = new raceCar();
		parentcar.runs();
		
		
		
		
	}

}
