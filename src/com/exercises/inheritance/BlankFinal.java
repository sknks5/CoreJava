package com.exercises.inheritance;

class Student{
	private int id;
	
	public Student(int id){
		this.id = id;
	}
	
	public void changeId(int newid){
		this.id = newid;
	}
	
	public String toString(){
		return String.valueOf(id);
	}
}
public class BlankFinal {
	
	private final Student student;
	
	public BlankFinal(int id)
	{
		student = new Student(id);
	}
	
	public static void main(String[] args){
		BlankFinal blFin = new BlankFinal(178942);
		System.out.println("Student id = " + blFin.student);

		blFin.student.changeId(180000);
		System.out.println("Student id = " + blFin.student);
	}
}
