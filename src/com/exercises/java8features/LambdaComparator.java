package com.exercises.java8features;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaComparator implements Comparator<Employee> {
	
	static List<Employee> employees = new ArrayList<>();
	static 
	{
		employees.add(new Employee("Kishan", 13));
		employees.add(new Employee("Sanjana", 19));
		employees.add(new Employee("Keerthi", 22));
		employees.add(new Employee("Nirmala", 46));
		employees.add(new Employee("Sivakumar", 47));
		
	}
	
	public static void main (String[] args){
		
		
		LambdaComparator lC = new LambdaComparator();
		lC.compareEmployeesByName();
		lC.compareEmployeesByAge();

		
	}
	
	
	public void compareEmployeesByAge(){
		System.out.println("Sorting Employees By Age");
		Collections.sort(employees, ( e1,  e2) -> e1.getAge() - e2.getAge());
		/*
		Collections.sort(employees, new Comparator<Employee>() {
				public int compare(Employee e1, Employee e2) {
					return e1.getAge() - e2.getAge();
				}}
				);
		*/
				
		for (Employee employee : employees){
			System.out.println("Employee Name ->" + employee.getName() + " Age ->" + employee.getAge());
		}
		
	}	
	
	public void compareEmployeesByName(){		
		
		Collections.sort(employees, new LambdaComparator());
		
		System.out.println("Sorting Employees By Name");
		
		for(Employee employee : employees) {
			System.out.println("Employee Name ->" + employee.getName() + " Age ->" + employee.getAge());
		}
		
	}

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}
	
	

}

/*
class CompareEmployeeWLambda {

	static List<Employee> employees = new ArrayList<>();
	static 
	{
		employees.add(new Employee("Kishan", 13, "C9988776"));
		employees.add(new Employee("Sanjana", 19, "C889988"));
		employees.add(new Employee("Keerthi", 22, "C787654"));
		employees.add(new Employee("Nirmala", 46, "A234567"));
		employees.add(new Employee("Sivakumar", 47, "A12349"));
		
	}
	
	public void compareEmployeeWithLambdaComparator(){
		Collection.sort(employees, (Employee e1, Employee e2) -> e1.getId.compareTo(e2.getId())); 
	}
	
	
	
}
*/
class Employee  {
	
	private String name;
	private int age;
	
	
	
	
	public Employee(String name, int age) {
	
		this.name = name;
		this.age = age;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
