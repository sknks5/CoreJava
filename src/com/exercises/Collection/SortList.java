package com.exercises.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortList {
	
	public static void fill(List<String> list){
		list.add("India");
		list.add("China");
		list.add("USA");
		list.add("Japan");
		list.add("Mexico");
		list.add("Argentina");
		list.add("Peru");
  		
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("*** Working with ArrayList****");
		List<String> countryList = new ArrayList<>();
		fill(countryList);
		System.out.println(countryList);
		Collections.sort(countryList);
		System.out.println(countryList);
		System.out.println("Now shuffling");
		for (int i =0;i<5;i++){
			Collections.shuffle(countryList);
			System.out.println(countryList);
			Thread.sleep(500);
		}
		
		System.out.println("*** Working with LinkedList****");
		List<String> countryList2 = 
		
		
	}

}
