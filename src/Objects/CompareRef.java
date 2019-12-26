package Objects;

public class CompareRef {
	
	public static void main(String[] args){
		Integer i1 = new Integer(47);
		Integer i2 = new Integer(47);
		
		System.out.println(i1 == i2);
		System.out.println(i1 != i2);

		System.out.println(i1.equals(i2));
		System.out.println(!i1.equals(i2));
		
		System.out.println("i1 = " + i1);
		System.out.println("i2 = " + i2);
		
		i1 = i2;
		System.out.println("After object ref assignment ==");
		System.out.println(i1 == i2);
		System.out.println(i1 != i2);
		System.out.println("After object ref assignment equals");		
		System.out.println(i1.equals(i2));
		System.out.println(!i1.equals(i2));
		

	}

}
