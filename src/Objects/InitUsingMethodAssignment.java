package Objects;

public class InitUsingMethodAssignment {
	
	private int i = f();
	private int f(){
		return 11;
	}
	public static void main(String[] args){
		InitUsingMethodAssignment init = new InitUsingMethodAssignment();
		System.out.println(init.i);
	}

}
