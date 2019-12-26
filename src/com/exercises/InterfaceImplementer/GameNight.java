package com.exercises.InterfaceImplementer;

import java.util.Random;

import com.exercises.Interface.Coin;
import com.exercises.Interface.Game;
import com.exercises.Interface.dice;

class Ludo implements dice, Game {

	@Override
	public int roll() {
		Random rand = new Random();
		
		int diceFace = rand.nextInt(6);
		
		switch(diceFace){
		case 0:
			roll();
			break;
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
			System.out.println("move coin " + diceFace + " box to the left. Switch player");
			break;			
		}
		if (diceFace == 0)
		{
			System.out.println("roll again");
			roll();
		}		
		return diceFace;
	}

	@Override
	public void startPlay() {
		System.out.println("Youngest rolls first");
		this.roll();
	}
	
	public String toString(){
		return "Ludo";
	}
	
}

class CoinTossGame implements Coin, Game {

	@Override
	public String toss() {
		Random rand = new Random();
		int outcome = rand.nextInt(2);
		if (outcome == 1 )
			return Coin.HEADS;
		else
			return Coin.TAILS;
	}

	@Override
	public void startPlay() {
		System.out.println("Youngest tosses first");
		this.toss();
	}
	
	public String toString(){
		return "CoinTossGame";
	}
}

class GameFactory {	
	
	static Game getGame(){
		Random rand = new Random();
		int decider = rand.nextInt(10);
		if (decider > 5)
			return new CoinTossGame();
		else
			return new Ludo();		
	}
}


public class GameNight {	

	public static void main(String[] args){		
		Game game1 = GameFactory.getGame();
		game1.startPlay();
		System.out.println(game1);

		Game game2 = GameFactory.getGame();
		game2.startPlay();
		System.out.println(game2);

		
	}
}
