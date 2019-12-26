package com.exercises.generics;

import java.util.ArrayList;

class Gerbil {
	
	private static int counter = 0;
	private int id;
	
	public Gerbil(){
		counter++;
		this.id = counter;
	}
	public void Hop(){
		System.out.println("Gerbil #" + id + " Hops");
	}
}

public class GerbilHop {
	
	public static void main(String[] args){
		
		ArrayList<Gerbil> gerbils = new ArrayList<>();
		for (int i=0;i<10;i++)
		gerbils.add(new Gerbil());
		
		for (Gerbil g : gerbils){
			g.Hop();
		}
		
		System.out.println("Using get method " );
		for (int i=0;i<gerbils.size();i++){			
			gerbils.get(i).Hop();
		}
	}
}
