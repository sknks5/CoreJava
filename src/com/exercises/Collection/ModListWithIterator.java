package com.exercises.Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Iterator;

public class ModListWithIterator {
	
	public static void main(String[] args){
		
		List<String> names = new ArrayList<>();
		
		names.add("Kishan");
		names.add("Sanju");
		names.add("Keerthi");
		
		Iterator<String> namesList = names.iterator();
		
		boolean once = false;
		while (namesList.hasNext()){
			System.out.println(namesList.next());
			if (!once) {
			namesList.remove();
			once = true;
			}
		}
		
		ListIterator<String> namesll = names.listIterator();
		System.out.println("next index ==>" + namesll.nextIndex());
		
		while (namesll.hasNext()){
			if (namesll.nextIndex() == 1)
				namesll.add("Nirmala");
			System.out.println(namesll.next() + "next index ==>" + namesll.nextIndex());
		}

		ListIterator<String> newnamesll = names.listIterator();
				
		while (newnamesll.hasNext()){
			System.out.println(newnamesll.next());
		}
		
		
		
		
	}

}
