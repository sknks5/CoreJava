package Objects;

public class Drink {
	
	private String type;
	
	public String toString(){
		return type;
	}
	
	public void fillCupWith(String type){
		this.type = type;
	}
	public String checkWhatsInCup(){
		return type;
	}
	
	
	
}
