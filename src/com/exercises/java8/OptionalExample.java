package com.exercises.java8;

import java.util.Optional;

public class OptionalExample {
	
	private static String name2;
	private static String name;

	public static void main(String[] args){
		
		
		Optional<String> opt = Optional.ofNullable(name);
		System.out.println("name ==>" + opt.get());
		System.out.println("length of name->" + opt.get().length());
		System.out.println("name 2==>" + name2);
		System.out.println("length of name2->" + name2.length());
		
		
	}

}
