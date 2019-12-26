package com.exercises.Collection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class StarWarsNameGen {

	public static ArrayList<String> StarWarsNames = new ArrayList<>();
	private static int index = 0;
	static 
	{
		StarWarsNames.add("Anakin SkyWalker");
		StarWarsNames.add("Yoda");
		StarWarsNames.add("Luke SkyWalked");
		StarWarsNames.add("Obi-Wan Kanobi");
		StarWarsNames.add("Kylo Ren");
		StarWarsNames.add("R2-D2");
		StarWarsNames.add("Han Solo");
		StarWarsNames.add("Sheev Palpatine");
		StarWarsNames.add("Clone Trooper");
		StarWarsNames.add("Jaba the Hutt");
		StarWarsNames.add("General Greivous");
		StarWarsNames.add("Rey");
		StarWarsNames.add("Mace Windu");
		StarWarsNames.add("Count Dooku");
	}
	public static String next(){
		if (index < (StarWarsNames.size() -1 ))
			index++;
		else
			index = 0;

		return StarWarsNames.get(index);
	}
	
	public static Collection fill(Collection collection){
		int count = 0;
		while (count < 20) {
		collection.add(StarWarsNameGen.next());
		count++;
		}
		return collection;
    }
	public static void printCollection(Collection collection){
		System.out.println(collection);
	}
	
	public static void main(String[] args){
		System.out.println("ArrayList");
        ArrayList<String> Al1 = new ArrayList<>();
		printCollection(StarWarsNameGen.fill(Al1));
		System.out.println("SubList");
		List<String> subList = Al1.subList(1, 4);
		System.out.println(subList);
		System.out.println(Al1.contains("Yoda"));
		System.out.println(Al1.contains(new String("Yoda")));
		
		String yoda = new String("Yoda");
		System.out.println(Al1.indexOf("Yoda"));
		System.out.println(Al1.indexOf(yoda));
		

		


		/*
		System.out.println("LinkedList");
		printCollection(StarWarsNameGen.fill(new LinkedList<>()));
		System.out.println("HashSet");
		printCollection(StarWarsNameGen.fill(new HashSet<>()));
		System.out.println("TreeSet");
		printCollection(StarWarsNameGen.fill(new TreeSet<>()));
		System.out.println("LinkedHashTreeSet");
		printCollection(StarWarsNameGen.fill(new LinkedHashSet<>()));
		*/
		
		
		List<String> Al2 = new ArrayList<>(); 
		System.out.println(Al2);
		Al2.addAll(Al1);
		System.out.println(Al2);
		System.out.println(Collections.binarySearch(Al2, "Luke SkyWalked"));
		Collections.sort(Al2);
		System.out.println("Sorted list");
		System.out.println(Al2);
		System.out.println(Collections.binarySearch(Al2, "Luke SkyWalked"));
		Al2.set(Al2.indexOf("Luke SkyWalked"), "Luke SkyWalker");
		System.out.println(Al2);
		
		
		
	}
	
}
