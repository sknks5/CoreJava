package com.exercises.inheritance;

class myBaseClass{
	
	public myBaseClass() {
		System.out.println("Base class constructor");
	}
	
	static int i = 47;
	static 
	{
		System.out.println("Static Initialization in base class. Value of i= " + i );
	}
}

public class ClassLoadTest extends myBaseClass {
	
	public ClassLoadTest(){
		System.out.println("Derived class constructor");
	}
	
	static int j = 57;
	static 
	{
		System.out.println("Static Initialization in Derived class. Value of j= " + j );
	}
	
	public static void main (String[] args){
		ClassLoadTest clt = new ClassLoadTest();
		System.out.println(myBaseClass.i);
		ClassLoadTest clt2 = new ClassLoadTest();
	}
	

}
