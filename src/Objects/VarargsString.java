package Objects;

public class VarargsString {
	
	public static void f(String...args) {
		for (String arg : args) {
			System.out.println("Argument = " + arg);
		}
	}
	
	public static void main(String[] args) {
		f(new String[]{"Keerthi", "Sanju", "Kishan", "Nirmala"});
		f("Keerthi1", "Sanju1", "Kishan1", "Nirmala1");
	}
	

}
