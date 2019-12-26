package Objects;

public class WaterTank {
	private boolean isEmpty;
	
	public WaterTank(boolean isEmpty){
		this.isEmpty = isEmpty;
	}
	public void fillTank(){
		this.isEmpty = false;
	}
	public void emptyTank(){
		this.isEmpty = true;
	}
	
	protected void finalize(){
		if (!this.isEmpty){
			System.out.println("Water tank isn't empty. Tank cannot be destroyed");
		}
	}
	public void checkTank(){
		if (this.isEmpty)
			System.out.println("Tank is Empty");
		else
			System.out.println("Tank has water in it");
	}
	
	public static void main(String[] args){
		WaterTank waterTank = new WaterTank(true); //Water tank created with isEmpty set to true. Tank is empty
		waterTank.checkTank();
		waterTank.fillTank();  //Tank is filled up. So, isEmpty is set to false;
		waterTank.checkTank(); //Checking now, it should say tank has water in it.
		waterTank.emptyTank(); //Tank is emptied
		waterTank.checkTank(); //Checking now, it should say tank is empty.
		new WaterTank(false);  //Water tank object created with no object reference
		System.gc();		
	}
	

}
