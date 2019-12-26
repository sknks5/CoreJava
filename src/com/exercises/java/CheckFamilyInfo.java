package com.exercises.java;

public class CheckFamilyInfo {
	
	public static void main(String[] args){
		
		String[] familyNames = new String[5];
		String familyNamesStr = getFamilyNames();
		if (familyNamesStr != null) {
		familyNames = getFamilyNames().split(",");
		System.out.println(familyNames.length);
		if (familyNames.length < 2){
			//System.out.println("Bad formatting");
		}
		else
		{
			for(int i=0;i<familyNames.length;i++)
				System.out.println(familyNames[i] + " ");
		}
		}
		else
			System.out.println("Bad return");
	}
	
	public static String getFamilyNames(){
		return "".trim();
		
	}

}
