package com.exercises.Collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class FamilyHashMap {
	
	public static void main(String[] args){
		Map<String, String> familyMap = new HashMap<>();
		familyMap.put("120496", "Keerthi");
		familyMap.put("031800", "Sanju");
		familyMap.put("080906", "Kishan");
		familyMap.put("081673", "Nirmala");
		familyMap.put("032972", "Sivakumar");
		
		System.out.println(familyMap);
		
		Map<String, String> familyMapLHM = new LinkedHashMap<>();
		
		Set<String> keySet = familyMap.keySet();
		for (String key : keySet) {
			familyMapLHM.put(key, familyMap.get(key));
			System.out.println("Key==>" + key + " ,Value==>" + familyMap.get(key));
		}
		
		System.out.println(familyMapLHM);
		
		
	}

}
