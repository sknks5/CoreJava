package com.exercises.InterfaceImplementer;

import com.exercises.Interface.CanClimb;
import com.exercises.Interface.CanFight;
import com.exercises.Interface.CanFly;
import com.exercises.Interface.CanSwim;

class Hero implements CanSwim {

	@Override
	public void swim() {
       System.out.println("Swim Hero Swim");	
	}	
}

public class ActionHero extends Hero implements CanClimb, CanFight, CanFly{

	@Override
	public void fly() {
	       System.out.println("Fly ActionHero Fly");
	}

	@Override
	public void fight() {
		System.out.println("Fight ActionHero Fight");		
	}

	@Override
	public void climb() {
		System.out.println("Climb ActionHero Climb");		
	}
	
	public static void t(CanFly f){
		f.fly();
	}
	public static void u(CanFight f){
		f.fight();
	}
	public static void v(CanClimb c){
		c.climb();
	}
	public static void w(CanSwim s){
		s.swim();
	}
	
	public static void main(String[] args){
		ActionHero actionHero = new ActionHero();
		t(actionHero);
		u(actionHero);
		v(actionHero);
		w(actionHero);
	}

}
