package Objects;

public class StringArrayConstructorParm {
	
	public StringArrayConstructorParm(String[] parms){
		
		for (String parm : parms) {
			System.out.println(parm);
		}
	}
	
	public static void main (String[] args) {
		StringArrayConstructorParm sac = new StringArrayConstructorParm(new String[]{"Keerthi", "Sanju", "Kishan"});
	}

}
