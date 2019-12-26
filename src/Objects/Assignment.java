package Objects;

class Tank {
	int level;
}

public class Assignment {
	public static void main(String[] args){
		Tank t1 = new Tank();
		Tank t2 = new Tank();
		t1.level = 44;
		t2.level = 45;
		
		System.out.println("t1.level = " + t1.level);
		System.out.println("t2.level = " + t2.level);
		
		t2 = t1;
		System.out.println("After assigning t1 to t2");
		System.out.println("t1.level = " + t1.level);
		System.out.println("t2.level = " + t2.level);
		
		t1.level = 11;
		System.out.println("After assigning t1 is modified");
		System.out.println("t1.level = " + t1.level);
		System.out.println("t2.level = " + t2.level);

		t2.level = 17;
		System.out.println("After assigning t2 is modified");
		System.out.println("t1.level = " + t1.level);
		System.out.println("t2.level = " + t2.level);
		
		
		
		
	}

}
