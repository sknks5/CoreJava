package InnerClasses;

public class Outer {
	
	private int outerValue;
	
	public Outer(int outerValue){
		this.outerValue = outerValue;
	}
	
	class Inner {
		private int innerVal = 10;
		Inner(){
			int totalValue = innerVal + outerValue;
			System.out.println("Creating Inner class with value = " + totalValue);
		}
	}
	
	public Inner getInner(){
		return new Inner();
	}
	
	public static void main(String[] args){
		Outer outer = new Outer(50);
		Outer.Inner inner = outer.getInner();
		
	}

}
