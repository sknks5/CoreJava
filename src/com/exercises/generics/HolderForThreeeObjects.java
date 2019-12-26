package com.exercises.generics;

import java.util.Arrays;
import java.util.Random;

class Holder<T>{
	
	private T[] t;
	
	public Holder(){
		
	}
	
	public Holder(T[] t){
		this.t = t;
	}
	
	public T[] getValues(){
		return t;
	}
	
	public void setValues(T[] t){
		this.t = t;
	}	
}

class Student{
	private String name;
	private int id;
	
	public Student(String name, int id){
		this.name = name;
		this.id = id;
	}
	
	public String getName(){
		return name;
	}
	
	public int getId(){
		return id;
	}
	public void setName(String name){
		this.name = name;
	}
	
	public void setId(int id){
		this.id = id;
	}
}
public class HolderForThreeeObjects {
	
	public static void main(String[] args){
		
		Holder<Student> studentList = new Holder<Student>();
		Student[] studentArray = new Student[3];
		studentArray[0] = new Student("Keerthi", 20);
		studentArray[1] = new Student("Sanju", 17);
		studentArray[2] = new Student("Kishan", 11);
		
		studentList.setValues(studentArray);
		
		for (Student student : studentList.getValues()){
			System.out.println(student.getName() + " " + student.getId());
		}
		
		Holder<Integer> intList = new Holder<>();
		Integer[] intArray = new Integer[3];
		Random rand = new Random();
		for (int i=0;i<3;i++)
			intArray[i] = rand.nextInt(99);
		
		intList.setValues(intArray);
		
		for (int i : intList.getValues()){
			System.out.println(i);
		}
		
		
		
		
	}

}
