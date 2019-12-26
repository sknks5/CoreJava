package com.exercises.Collection;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class InsertMiddleOfListTest {
	
	public static void insertInMiddle(List<Integer> collection, int number){
		int listSize = collection.size();
		if (listSize > 0)
			collection.add(listSize/2, number);
		else
			collection.add(number);		
	}
	
	public static ListIterator<Integer> getIterator(List<Integer> list){
		return list.listIterator(list.size()/2);
	}
	public static void main(String[] args){
		
		List<Integer> numberList = new LinkedList<>();
		for (int i=0;i<20;i++)
		 insertInMiddle(numberList, i);
		System.out.println(numberList);
		
		System.out.println("Using List Iterator method");
		List<Integer> numberList2 = new LinkedList<>();
		for (int i=0;i<20;i++)
			 getIterator(numberList2).add(i);
			System.out.println(numberList2);

		
		
		
		
	}

}
