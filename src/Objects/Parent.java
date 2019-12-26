package Objects;

public class Parent {
	private String name;
	
	public Parent(String name){
		this.name = name;
	}
	public static boolean isLicenseValid(String id){
		if (id != null)
			return true;
		else
			 return false;
	}

}
