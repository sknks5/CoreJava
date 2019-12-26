package InnerClasses;

public class OuterClass {
	
	private String name;
	
	class InnerClass{
		private String name;
	}
	
	public static void main(String[] args){
		OuterClass outer = new OuterClass();
		outer.name = "Kishan";
		
		OuterClass.InnerClass inner = outer.new InnerClass();
		inner.name = "mukunda";
		
		
		System.out.println(outer.name);
	}

}
