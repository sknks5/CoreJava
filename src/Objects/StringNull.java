package Objects;

public class StringNull {
	
	private String s = "s";
	private String sc;
	
	private  StringNull() {
		sc = "sc";
		
	}
	
	public StringNull(int i) {
		this.StringNull();
	}
	
	
	
	
	private void StringNull() {
		// TODO Auto-generated method stub
		
	}


	public static void main (String[] args) {
		
		StringNull sn = new StringNull(10);
		System.out.println(sn.s);
		
		System.out.println(sn.s);
		System.out.println(sn.sc);
	}

}
