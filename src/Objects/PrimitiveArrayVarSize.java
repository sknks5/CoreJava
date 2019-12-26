package Objects;

import java.util.Random;

public class PrimitiveArrayVarSize {
	
	private int[] a;
	
	public static void main(String[] args) {
		PrimitiveArrayVarSize primArr = new PrimitiveArrayVarSize();
		Random rand = new Random(100);
		primArr.a = new int[rand.nextInt(50)];
		System.out.println(primArr.a.length);
		
		for (int i=0; i<primArr.a.length;i++){
			primArr.a[i] = rand.nextInt(99);
		}
		for (int i=0; i<primArr.a.length;i++){
			System.out.println(primArr.a[i]);
		}
		
		
	}

}
