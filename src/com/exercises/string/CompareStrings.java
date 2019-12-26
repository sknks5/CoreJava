package com.exercises.string;

public class CompareStrings {
	
	public static void main(String[] args){
		String s1 = "kishan";
		String s2 = new String(s1);
		String s3 = s1.intern();
		String s4 = s2.intern();
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1 == s3);
		System.out.println(s3 == s4);
	}

}
