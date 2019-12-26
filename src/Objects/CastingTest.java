package Objects;

public class CastingTest {

	public static void main(String[] args) {
		
		long lng = 100;
		int i = 10;
		short s = 11;
		
		i = (int)lng;
		s = (short) i;
		lng = i;
		lng = s;
		s = (short) lng;
		s = (short) 200L;
		System.out.println(s);
		
		short s1 = 10;
		short s2 = 11;
		short s3 = (short) (s1 + s2);
		System.out.println(s3);
		
		int i1 = Integer.MAX_VALUE;
		System.out.println(i1);
		int i2 = Integer.MAX_VALUE;
		long i3 =  i1 + i2;
		System.out.println("i3 = " + (long)i3);
		
		String r = "-1";
		if (r.equals("-1"))
			System.out.println("Negative one");
		else
			System.out.println("Did not work");
		
		int[] elements = {1,2,3,4,5,6,7,8,9};
		
		int j = 0;
		while (elements[j] < 8) {
			System.out.println("elements[" + j + "] = " + elements[j]);
			j++;
		}
		
	}
}
