package com.exercises.inheritance;

class Name{
	private String Name;
	Name(String name){
		this.Name = name;
		System.out.println("Name initialized");
	}
}

class School{
	private String Name;
	School(String name){
		this.Name = name;
		System.out.println("School initialized");
	}
}


class GrandParent {
	
	GrandParent(){
		System.out.println("GrandParent created");
	}
}

class Parent extends GrandParent{
	
	Parent(){
		System.out.println("Parent created");
	}
}

class Child extends Parent{
	
	private Name name = new Name("Kishan");
	private School school = new School("Fowler");
	
	Child(){
		System.out.println("Child created");
	}
}

public class OrderOfInitialization {
	public static void main (String[] args){
		Child child = new Child();
	}

}
