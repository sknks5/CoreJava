package com.exercises.covariantReturn;

import java.util.ArrayList;
import java.util.Random;

public class BabyNameGenerator {
	
	private ArrayList<String> babyNameList;
	public BabyNameGenerator(){
		babyNameList = new ArrayList<String>();
		babyNameList.add("Kishan");
		babyNameList.add("Keerthi");
		babyNameList.add("Sanju");
		babyNameList.add("Nirmala");
		babyNameList.add("Jimmy");
		babyNameList.add("Jack");
		babyNameList.add("Sarah");
		babyNameList.add("abcd");
		babyNameList.add("defg");
		babyNameList.add("baby1");
		babyNameList.add("baby5");		
	}
	
	public static void main(String[] args){
		BabyNameGenerator babyNameGen = new BabyNameGenerator();
		Random rand = new Random();
		for (int i=0;i<5;i++){
			int randomIndex = rand.nextInt(babyNameGen.babyNameList.size());
			System.out.println(babyNameGen.babyNameList.get(randomIndex));
	}
  }
}
