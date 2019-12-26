package com.ems.verify;

public class StringNames {
	
	public static void main (String[] args) {
		String[] names = {"Kishan, Sanju, Nirmala, Keerthi"};
		String[] names2 = new String[] {"Kishan", "Sanju", "Nirmala", "Keerthi"};
		
		System.out.println("Length of names = " + names.length);
		System.out.println("Length of names2 = " + names2.length);
		
		String lookfor = "Nirmala:";
		String token = "Nirmala:3,Keerthi,Sanju,Kishan,Nirmala:3,Siva";
		System.out.println(token);
		token = token.replace(lookfor + 3, "Nirmala");
		System.out.println(token);
		
	}

}
