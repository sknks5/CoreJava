package com.exercises.inheritance;

public class car {
	
	void runs(){
		System.out.println("Car Accelerates 0-60 in 2 mins");
	}

}
class raceCar extends car{
	
	void runs(){
		System.out.println("RaceCar Accelerates 0-60 in 2 seconds!!!");
	}	
}



