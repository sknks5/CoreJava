package com.exercises.Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

public class IteratorModification {

	public static void main(String[] args){
		List<Integer> numList = new ArrayList<>();
		numList.addAll(Arrays.asList(1,2,3,4));
		
		try{


			for (Integer integer : numList){
				System.out.println(integer);
				numList.remove(2);
			}
		}
		catch(ConcurrentModificationException ex){
			System.out.println("Cannot remove arrayList element during iteration");
		}
	
		
		Iterator<Integer> iter = numList.iterator();
		while (iter.hasNext()){
			int integer = iter.next();
			if (integer == 2)
				iter.remove();
			System.out.println(integer);
		}
		
		Iterator<Integer> iter2 = numList.iterator();
		while (iter2.hasNext()){
			System.out.println("iterating again");
			int integer = iter2.next();
			System.out.println(integer);
		}
		 
		
		
 	}
}
