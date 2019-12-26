package InnerClasses;

public class StringSequence {
	
	private String name;
	
	public StringSequence(String name){
		this.name = name;
	}
	
	private class StringDisplay{		
		public String toString(){
			return "" + StringSequence.this;
		}		
	}
	
	public StringDisplay getStringValue(){
		return new StringDisplay();
	}
	
	public static void main(String[] args){
		
		StringSequence name1 = new StringSequence("Kishan");
		StringSequence.StringDisplay innerClass = name1.getStringValue();
		System.out.println(innerClass.toString());
	}
	

}
