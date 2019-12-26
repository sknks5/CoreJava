package Objects;

class Window {
	public Window(int marker){
		System.out.println("Completed Window " + marker);
	}
}	
class House {

	private Window window1 = new Window(1); //Variable initialization happens first
	public House(){
		System.out.println("Constructing House");
	}
	private Window window2 = new Window(2);//Variable initialization happens first
	private Window window3 = new Window(3);//Variable initialization happens first
}	

public class InitOrderTest {	
	public static void main(String[] args){
		InitOrderTest iot = new InitOrderTest();		
		House h = new House();
		
	}
}

