package com.exercises.covariantReturn;
import java.util.*;

public class CollectionAddAllTest {
	
	public static void main(String[] args){
		Collection<String> namesGroup = new HashSet<>();
		namesGroup.addAll(Arrays.asList("Kishan", "Keerthi", "Sanju", "Nirmala"));
		String[] moreNames = {"Nirmala", "Sivakumar"};
		namesGroup.addAll(Arrays.asList(moreNames));
		Collection<String> nickNames = new ArrayList<>();
		nickNames.add("kishi");
		nickNames.add("kitti babu");
		nickNames.add("madhava");
		nickNames.add("kesava");
		nickNames.add("kk");
		nickNames.add("keethima");
		nickNames.add("susana");
		nickNames.add("kishi");
		
		namesGroup.addAll(nickNames);
		
		for (String name : namesGroup){
			System.out.println(name);
		}
		
		List<String> namesList = new ArrayList<>();
		//namesList.addAll(namesGroup);
				
		Collections.addAll(namesList, "kishivasa");
		
		System.out.println("Display namesList");
		
		for (String names : namesList) {
			System.out.println(names);
		}
		
		//Trying extending underlying array
		
    	 List<String> subjects = Arrays.asList("English", "Math", "Science", "Orchestra");
		//subjects.add("PE");
		
		for (String subject: subjects){
			System.out.println(subject);
		}
		
		//Arrays.toString()
		
		String[] family = {"Nirmala", "Keerthi", "Sanju", "Kishan" };
		System.out.println(Arrays.toString(family));
	}

}
