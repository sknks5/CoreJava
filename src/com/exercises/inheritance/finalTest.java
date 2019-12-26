package com.exercises.inheritance;

public class finalTest {
	
	public static final int NUMBER_OF_CHILDREN = 3;
	public final int YearsInThisHouse = 14;

	public static void main(String[] args) {
		finalTest ft = new finalTest();
		int n = 3;
		if (n == finalTest.NUMBER_OF_CHILDREN){
			System.out.println("I have 3 children");
			System.out.println("Been in the house for " + ft.YearsInThisHouse);
		}
	}
}
