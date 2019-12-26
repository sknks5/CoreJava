package com.exercises.Collection;

import java.util.LinkedHashMap;

public class LinkedHashMapTest {
	
	public static void main (String[] args){
		
		LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
		map.put(20002, "MSF INFO 1 ");
		map.put(18018, "Critical 1 ON");
		map.put(17018, "Info 1 ON");		
		map.put(20001, "MSF Critical 1 ");
		map.put(18019, "Critical 1 OFF");
		map.put(20002, "MSF INFO 1 ");
		
		System.out.println("Before altering HashMap ==>" + map);
		
		if (map.containsKey(18018))
			map.remove(18018);
		
		map.put(10001, "Warn 1 OFF");
		
		System.out.println("After altering HashMap ==>" + map);
		
	}

}
