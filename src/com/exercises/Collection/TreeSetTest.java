package com.exercises.Collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class Student implements Comparable<Student>{
	private String Name;
	private int id;
	
	public Student(String Name, int id){
		this.setName(Name);
		this.setId(id);
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public int compareTo(Student b) {
		// TODO Auto-generated method stub
		return this.id - b.id;
	}

}

public class TreeSetTest {
	
	public static void main (String[] Args ) {
		
		Integer[] numList = {4,5,1,2,10,99,12,2,4};
		Set<Integer> numOrderSet = new TreeSet<>(Arrays.asList(numList));
	
		System.out.println(numOrderSet);
		
		Set<Student> studentList = new TreeSet<>();
		studentList.add(new Student("Keerthi", 2345));
		studentList.add(new Student("Sanju", 5678));
		studentList.add(new Student("Kishan", 6789));
		
		System.out.println(studentList);
		
		
		for (Student st : studentList) {
		  System.out.println(st.getName());
		  System.out.println(st.getId());
		  System.out.println("________________________");
		}
		
	}

}
