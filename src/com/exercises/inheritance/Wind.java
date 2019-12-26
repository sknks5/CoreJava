package com.exercises.inheritance;

class Instrument {
	
	public void play(){
		System.out.println("Instrument playing now");
	}
	
	public static void tune(Instrument i){
		i.play();
	}
}


public class Wind extends Instrument {
	public static void main (String[] args)
	{
		Wind flute = new Wind();
		Instrument.tune(flute);
	}
}

class precursion extends Instrument {
	public static void main(String[] args){
		precursion drums = new precursion();
		Instrument.tune(drums);
	}
	
}

