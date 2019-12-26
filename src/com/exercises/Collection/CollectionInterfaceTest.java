package com.exercises.Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class CollectionInterfaceTest {
	
	public static void main(String[] args){
		
        //Creating and initializing a Collection using another collection.
		//Constructing an ArrayList using Arrays.asList()
		
		Collection<String> cityList = new ArrayList<>(Arrays.asList("Dallas", "Plano", "Frisco", "McKinney", "Dallas"));
		Collection<String> cityList2 = new ArrayList<>();
		
		//Add new elements
		List<String> newList = Arrays.asList("test", "test1");
		//newList.add("test2"); Cannot add elements to a List collection that is backed by an array
		
		cityList2.addAll(Arrays.asList("Dallas", "Plano", "Frisco", "McKinney", "Dallas"));
		String[] newCities = {"Prosper", "Murphy", "Colony"};
		
		Collections.addAll(cityList2, "Little Elm");
		Collections.addAll(cityList2, newCities);
		
		
		Collection<String> uniqCityList = new HashSet<>();
		uniqCityList.addAll(cityList);
		
		
		
		for (String city : uniqCityList){
			System.out.println(city);
			
		}
		for (String city : cityList2){
			System.out.println(city +  "+++" );
			
		}
		for (String city : newList){
			System.out.println(city +  "+++" );
			
		}
		
	
		
	}

}
