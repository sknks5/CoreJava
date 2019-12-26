package com.exercises.Collection;
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;


public class LinkedListTest {
	
	public static void main(String[] args) {
		
		List<String> countries = new ArrayList<>();
		countries.add("India");
		countries.add("China");
		countries.add("Pakistan");
		countries.add("Sri Lanka");
		countries.add("Bangladesh");
		countries.add("Nepal");
		countries.add("Bhutan");
		
		List<String> countriesLL = new LinkedList<>();
		countriesLL.addAll(countries);
		System.out.println("Countries = " + countriesLL);
		System.out.println("Peek = " + ((LinkedList<String>)countriesLL).peek());
		System.out.println("After Peek = " + countriesLL);
		
		System.out.println("Peek First = " + ((LinkedList<String>)countriesLL).peekFirst());
		System.out.println("Peek Last = " + ((LinkedList<String>)countriesLL).peekLast());
		System.out.println("After Peek = " + countriesLL);
		
		System.out.println("Poll = " + ((LinkedList<String>)countriesLL).poll());
		System.out.println("Poll First = " + ((LinkedList<String>)countriesLL).pollFirst());
		System.out.println("Poll Last = " + ((LinkedList<String>)countriesLL).pollLast());
		System.out.println("Pop = " + ((LinkedList<String>)countriesLL).pop());
		System.out.println("After Poll/PollFirst/Poll Last and Pop = " + countriesLL);
		
		((LinkedList<String>)countriesLL).offer("India"); //Adds it to the end
		((LinkedList<String>)countriesLL).addLast("India"); //Adds it to the end
		System.out.println("After Offer = " + countriesLL);
		
		System.out.println("Indias positon in the LinkedList = " + countriesLL.indexOf("India"));
		System.out.println("getLast  = " + ((LinkedList<String>)countriesLL).getLast()); //returns the last element without removing it
		System.out.println("After get  Last = " + countriesLL);
		System.out.println("Indias positon in the LinkedList = " + countriesLL.indexOf("India"));
		System.out.println("Poll last = " + ((LinkedList<String>)countriesLL).pollLast());
		System.out.println("After Poll  Last = " + countriesLL);
		System.out.println("Indias positon in the LinkedList = " + countriesLL.indexOf("India"));
		
		List<String> subset = countries.subList(1, 3);
		System.out.println("Subset from original list = " + subset);
		countriesLL.addAll(subset);
		System.out.println("After subset was appended to countriesLL = " + countriesLL);
		
		((LinkedList<String>) countriesLL).add(2, "Burma");
		System.out.println("After adding into the list = " + countriesLL);
		
		
		
		
		
		
	}

}
