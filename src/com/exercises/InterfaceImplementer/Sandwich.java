package com.exercises.InterfaceImplementer;

import java.util.Arrays;

import com.exercises.Interface.FastFood;

public class Sandwich  implements FastFood{

	@Override
	public void canBeFixedFast() {
		// TODO Auto-generated method stub
		System.out.println("Sandwich is quick in fixing it");
		
	}

	@Override
	public void tastesGood() {
		// TODO Auto-generated method stub
		System.out.println("Sandwich is quite tasty");
		
	}

	@Override
	public void isPopular() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args){
		FastFood sandWich = new Sandwich();
		sandWich.canBeFixedFast();
		sandWich.isPopular();
		
		System.out.println(Arrays.toString(((String)"Hello Kishan").split("e")));
	}

}


