package com.exercises.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class RandomList<T> {
	
	List<T> storage = null;
	
	public RandomList(){	
		storage = new ArrayList<T>();
	}
	public void add(T t){
		storage.add(t);
	}
	public RandomList(T t) {
		storage.add(t);
	}
	
	public T select(){
		Random rand = new Random();
		return storage.get(rand.nextInt(5));
	}	
}

public class RandomListGen {
	
	public static void main(String[] args){
		RandomList<String> randomList = new RandomList<String>();
		String s = "Twinkle twinkle little star, how I wonder what you are ?";
		for (String a : s.split(" ")){
			randomList.add(a);
		}
		for (int i =0;i<10;i++){
			System.out.println(randomList.select());
		}
		
		RandomList<Double> listOfDoubles = new RandomList<>();
		double[] d = {1.0, 2.30, 4.52, 23.13, 424.123, 2442.133, 1.232};
		for (double e : d){
			listOfDoubles.add(new Double(e));
		}
		for (int i =0;i<10;i++){
			System.out.println(listOfDoubles.select());
		}
		
	}

}
