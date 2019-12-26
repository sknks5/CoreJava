package Objects;

public class DadTest {
	
	public static void main(String[] args){
		Dad dad = new Dad("Siva");
		if (Dad.isLicenseValid("123"))
			System.out.println("Siva has valid license");
	}

}
