package Objects;

public class Dog {
	
	public Dog(){
		System.out.println("Dog is made");
	}
	public Dog(int i){
		this();
		System.out.println("Dog made with heigh " + i + " feet");
		
	}
	public Dog(String s){
		this(10);
		System.out.println("Dog is made with name" + s);
	}
	
	public void bark(){
		System.out.println("howl");
	}
	
	public void bark(int i){
		System.out.println("bark");
	}
	
	public void bark(double d){
		System.out.println("growl");
	}
	
	public static void main(String[] args){
		Dog dog = new Dog("Jimmy");
		dog.bark();
		dog.bark(10);
		dog.bark((double) 10);
	}
	

}
