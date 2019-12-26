package com.exercises.Collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class VowelCountSet {
	
	public static void main (String[] args) {
		
		HashSet<String> vowels = new HashSet<>();
		vowels.add("a");
		vowels.add("e");
		vowels.add("i");
		vowels.add("o");
		vowels.add("u");
		String inp = "Hello and welcome to HashSet class";
		char[] inpCharStream = inp.toCharArray();
		Map<String, Integer> vowelCounter = new HashMap<>();
		
		int vowel = 0;
		for (char inpChar : inpCharStream) {
			String inpCharStr = Character.toString(inpChar);
			System.out.println(inpCharStr);
		if (vowels.contains(inpCharStr)){
			vowel++;
			Integer count = vowelCounter.get(inpCharStr);
			System.out.println(inpCharStr + "==>" + count);
			vowelCounter.put(inpCharStr, count == null ? 1 : ++count);			
			}
		}
		
		System.out.println("Vowel Count = " + vowel);
		System.out.println("Vowel Count = " + vowelCounter);
	}

}
