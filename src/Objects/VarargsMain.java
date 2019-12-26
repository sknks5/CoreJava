package Objects;

public class VarargsMain {
	
	public static void main(String...args){
		for (String arg : args) {
			System.out.println("argumaent passed = " + arg);
		}
	}
}

class Test {
	public static void main(String[] args) {
		VarargsMain.main("Keerthi","Sanju", "Kishan", "Nirmal");
	}
}
