package com.exercises.InterfaceImplementer;

import com.exercises.Interface.ChildrenCount;

public class Family implements ChildrenCount{
	
	public static void main(String[] args){
		Family family = new Family();
		if (family.CHILDREN_COUNT == 3){
			System.out.println("I have three kids");
		}
		
	}

}
