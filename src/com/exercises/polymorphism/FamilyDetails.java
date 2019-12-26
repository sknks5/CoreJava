package com.exercises.polymorphism;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

abstract class Person {
	protected String name;
	protected int age;
	protected List<String> hobbies;
	
	 public String getName(){
		 return name;		 
	 }	 
	 public void setName(String name){
		 this.name = name;
	 }
	 public int getAge() {
		 return age;
	 }
	 public void setAge(int age){
		 this.age = age;
	 }

	 abstract public String returnHobbies();
	 abstract public void addHobbies(String hobby);
}

class child extends Person{
	
	 public String returnHobbies(){
		 Iterator<String> hobbyIterator = hobbies.iterator();
		 String hobbiesList = new String("");
		 while (hobbyIterator.hasNext()){
			 hobbiesList += hobbyIterator.next();
		 }
		 return hobbiesList;		 		 
	 }
	 
	 public void addHobbies(String hobby){
		 hobbies.add(hobby);
	 }	 
}

class parent extends Person{
	
	 public String returnHobbies(){
		 return "No hobby";		 		 
	 }
	 
	 public void addHobbies(String hobby){
		 return;
	 }
}


public class FamilyDetails {
	
	public static void main(String[] args){
		
		Person[] children = {new child(), new child(), new child(), new parent()};
		children[0].setName("Keerthi");
		children[0].setAge(20);
		children[0].hobbies = new ArrayList<>();
		children[0].addHobbies("Basketball ");
		children[0].addHobbies("Singing ");
		children[0].addHobbies("Reading ");
		children[0].addHobbies("NetFlix ");
		
		children[1].setName("Sanju");
		children[1].setAge(17);
		children[1].hobbies = new ArrayList<>();
		children[1].addHobbies("Volleyball ");
		children[1].addHobbies("Dancing ");
		children[1].addHobbies("YouTube ");
		
		children[2].setName("Kishan");
		children[2].setAge(11);
		children[2].hobbies = new ArrayList<>();
		children[2].addHobbies("Soccer ");
		children[2].addHobbies("Legos ");
		children[2].addHobbies("XBOX ");
		
		children[3].setName("Nirmala");
		children[3].setAge(43);
		
		
        for (int i=0;i<children.length;i++){
        	System.out.println(children[i].getName());
        	System.out.println(children[i].getAge());
        	System.out.println(children[i].returnHobbies());
        }
		
	}	

}
