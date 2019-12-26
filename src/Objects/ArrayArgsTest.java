package Objects;

public class ArrayArgsTest {
	
	public static void main(String[] args){
		Other.main(new String[] { new String("Nirmala"), "Keerthi", "Sanju", new String("Kishan")});
		String[] kids = {"Keerthi", "Sanju", "Kishan"};
		YetAnotherOne.main(kids);
	}

}

class Other {
	public static void main (String[] args){
		for (String name : args) {
			System.out.println(" I love " + name);
		}
		System.out.println(" I am done");
		
	}
}

class YetAnotherOne {
	public static void main (String[] args){
		for (String name : args) {
			System.out.println(" I love " + name);
		}
		System.out.println(" I am done with kids");
		
	}
	
}
