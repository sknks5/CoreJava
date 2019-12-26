package Objects;

public class InstanceKishan {
	
	
	private static final String name; 
	public String school;
	public int grade;
    public String[] favBooks = {"Harry Porter", "Soccer books", "Pokemon"};
	
	static{
	  name = "kishan";
	  System.out.println("Initializing name");
	}
	
	public InstanceKishan(String school, int grade){
        System.out.println("Object creation for " + name);
		this.school = school;
		this.grade = grade;
	}
	public String getName(){
		return name;
	}

}
