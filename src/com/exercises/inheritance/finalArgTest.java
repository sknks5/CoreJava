package com.exercises.inheritance;

public class finalArgTest {
	
	private String name;
	
	public static void main (String[] args) {
		finalArgTest faT = new finalArgTest();
		faT.name = "Kishan";
		faT.checkName(faT.name);
		System.out.println(faT.name);
		faT.name = "Sanju";
		System.out.println(faT.name);
		
 		
	}
	
	public boolean checkName(final String name){

		if ( (name.indexOf('a') > 0) ||
			 (name.indexOf('e') > 0) ||
			 (name.indexOf('i') > 0) ||
			 (name.indexOf('o') > 0) ||
			 (name.indexOf('u') > 0)) {
			return true;
		}
		return false;
	}

}
