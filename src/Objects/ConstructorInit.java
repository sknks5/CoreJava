package Objects;

public class ConstructorInit {
	
	private int age;
	
	public ConstructorInit(){
		System.out.println("this.age = " + this.age);
		this.age = 11;
	}
	
	public static void main(String[] args){
		ConstructorInit init = new ConstructorInit();
		System.out.println("this.age after construction = " + init.age);
	}

}
