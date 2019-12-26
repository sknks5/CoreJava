package Objects;

public class StaticKishanTest {

	public static void main(String[] args) {
		System.out.println("In main");
		StaticKishan sk1 = new StaticKishan();
		System.out.println("Post sk1 ");
		StaticKishan sk2 = new StaticKishan();
		sk2.name = "sanjana";
		sk2.age = 17;
		
		System.out.println(sk1.name + "--" + sk1.age);
		System.out.println(sk2.name + "--" + sk2.age);
		
		
	}
}
