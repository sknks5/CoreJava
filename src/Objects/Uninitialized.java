package Objects;

public class Uninitialized {
	
	private int num;
	private char a;
	
	public static void main(String[] args) {
		Uninitialized uninit = new Uninitialized();
		System.out.println("num = " + uninit.num);
		System.out.println("char = " + uninit.a);
	}

}
