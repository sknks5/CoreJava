package Objects;

public class Sprinklers {
	
	private String valve1, valve2;
	private WaterSource source = new WaterSource();
	
	public Sprinklers(){
		valve1 = "Water from valve1";
		valve2 = "Water from valve2";		
	}
	
	public String toString(){
		return valve1 + valve2 + source;
	}
	
	public static void main(String[] args){
		Sprinklers sprinklers = new Sprinklers();
		System.out.println(sprinklers);
		
	}

}
