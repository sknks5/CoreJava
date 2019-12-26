package com.exercises.InterfaceImplementer;

import com.exercises.Interface.Cycle;
import com.exercises.Interface.CycleFactory;

class UniCycle implements Cycle{

	@Override
	public int getNumberOfWheels() {
		return 1;
	}

	@Override
	public String balance() {
		return "Hard to balance with " + getNumberOfWheels();
	}	
}

class BiCycle implements Cycle{

	@Override
	public int getNumberOfWheels() {
		return 2;
	}

	@Override
	public String balance() {
		return "Hard to balance with " + getNumberOfWheels();
	}	
}

class UniCycleFactory implements CycleFactory {

	@Override
	public Cycle getCycle() {
		// TODO Auto-generated method stub
		return new UniCycle();
}
}

class BiCycleFactory implements CycleFactory {

		@Override
		public Cycle getCycle() {
			// TODO Auto-generated method stub
			return new BiCycle();
	}
}

public class RideCycle {
	
	public static void BuyCycle(CycleFactory cf) {
		Cycle myCycle = cf.getCycle();
		System.out.println(myCycle.getNumberOfWheels());
		System.out.println(myCycle.balance());
	}
	
	public static void main(String[] args){
		CycleFactory biCycleFactory = new BiCycleFactory();
		CycleFactory uniCycleFactory = new UniCycleFactory();
		BuyCycle(biCycleFactory);
		BuyCycle(uniCycleFactory);
	}

	
}






