package Objects;

public class Cup {
	
	private Drink drink;
	
	public Cup(){		
	}
	public String toString(){
		return "I am going to enjoy drinking this " + drink;  
	}
	public void fillCup(Drink drink){
		this.drink = drink;
	}
	
	
	public static void main(String[] args){
		Drink drink = new Drink();
		drink.fillCupWith("tea");
		System.out.println(drink.checkWhatsInCup());
		Cup myCup = new Cup();
		myCup.fillCup(drink);
		System.out.println(myCup);
		
		int x = 10;
		double a = x;
	
		System.out.println("Double a = " + a + " int x = " + x);
	}

}
