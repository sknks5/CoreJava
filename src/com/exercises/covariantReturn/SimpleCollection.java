package com.exercises.covariantReturn;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class SimpleCollection {
	
	public static void main(String[] agrs){
		Collection<Integer> simpleCollection = new ArrayList<Integer>();
		for (int i=0;i<10;i++){
			simpleCollection.add(i);
			simpleCollection.add(i);
		}
		
		for (Integer i : simpleCollection){
			System.out.println("ArrayList Output -->" + i);
		}
		
		Collection<Integer> simpleSet = new HashSet<>();
		for (int i=0;i<10;i++){
			simpleSet.add(i);
			simpleSet.add(i);			
		}
		
		for (Integer i : simpleSet) {
			System.out.println("HashSet Output -->" + i);
		}
 	}

}
