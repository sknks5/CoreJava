package com.exercises.covariantReturn;

class Currency{
	private String country;
	Currency(){
		System.out.println("Dummy currency");
	}
}

class Dollar extends Currency{
	private String country;
	Dollar(){
		this.country = "USA";
	}
	public String toString(){
		return country + " currency returned";
	}
}
class Rupee extends Currency{
	private String country;
	Rupee(){
		this.country = "India";
	}
	public String toString(){
		return country + " currency returned";
	}
	
}

class Teller{
	Teller(){
		System.out.println("Could be a person");
	}
	
	public Currency returnCash(){
		return new Currency();
	}
}
public class TellerMachine extends Teller{
	TellerMachine(){
		System.out.println("Lets assume it is in US");
	}
	
	public Dollar returnCash(){
		return new Dollar();
	}
	
	public static void main(String[] args){
		TellerMachine atm = new TellerMachine();
		System.out.println(atm.returnCash());
		
		Teller teller = new TellerMachine();
		System.out.println(teller.returnCash());
	}

}
