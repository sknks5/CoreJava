package com.exercises.java;
import Objects.FamilyEnum;

public class TestImport {
	
	public static void main (String[] args){
		for (FamilyEnum familyMember : FamilyEnum.values()){
			System.out.println("Family member -->" + familyMember);
		}
	}

}
