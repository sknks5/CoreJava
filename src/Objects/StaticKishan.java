package Objects;

public class StaticKishan {
	
	public static String name = "Kishan";
	public static int age = 11;
	
		static {
		String height = "4 10";
		int weight = 89;
		System.out.println("Kishans height = " + height + " and weight = " + weight);
		System.out.println("Name = " + name + " and age = " + age);
	}
	
	public StaticKishan() {
		System.out.println("In Constructor");
	}
}
