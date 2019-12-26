package InnerClasses;

interface Content {
	int getValue();
}

interface Destination {
	String readLabel();
}


public class ParcelStaticNestedClassTest {
	
	static class contents implements Content{
		
		private int value = 10;
		@Override
		public int getValue() {
			return value;
		}	

	}
	
	class ParcelDestination implements Destination{

		private String label;

		public ParcelDestination(String to) {
			this.label = to;		
		}

		@Override
		public String readLabel() {
			// TODO Auto-generated method stub
			return label;
  		}		
		
	}
	
	public static Content getContents(){
		return new contents();
	}
	
	public Destination getDestination(String s){
		return new ParcelDestination(s);
	}
	
	public static void main (String[] args){
		
		Content contents = getContents();
		ParcelStaticNestedClassTest parcel = new ParcelStaticNestedClassTest();
		Destination destination = parcel.getDestination("India");
		
		System.out.println(contents.getValue());
		System.out.println(destination.readLabel());
		
		
	}
	
	

}
