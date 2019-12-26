package com.exercises.Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
	
	public static void fillMap(Map<String, String> myMap){
		myMap.put("India", "New Delhi");
		myMap.put("USA", "Washington D.C");
		myMap.put("Mexico", "Mexico City");
		myMap.put("UK", "London");
		myMap.put("China", "Beijing");
		
	}
	
	public static void main(String[] args) {
		Map<String, String> capitalMap = new HashMap<>();
		fillMap(capitalMap);
		System.out.println("**** HashMap output***");
		System.out.println(capitalMap);
		List<String> sortedList = sortKeys(capitalMap);
		Map<String, String> capitalMap2 = new LinkedHashMap<>();
		for (String key : sortedList){
			if (capitalMap.containsKey(key))
				capitalMap2.put(key, capitalMap.get(key));
		}
		System.out.println("**** LinkedHashMap output***");
		System.out.println(capitalMap2);
	}
	
	public static List<String> sortKeys(Map<String, String> myMap){
		
		Set<String> keySet = myMap.keySet();
         for (String key : keySet){
        	 System.out.println(key);
         }
         List<String> sortedList = new ArrayList<String>(keySet);
         Collections.sort(sortedList);
         System.out.println(sortedList);
         
         return sortedList;
	}
	

}
