package Objects;

public class PrintFamilyDetails {
	
	public static void main(String[] args) {
		for (FamilyEnum familyEnum : FamilyEnum.values()){
			print(familyEnum);
		}
		
	}
	
	public static void print(FamilyEnum familyEnum) {
		
		switch(familyEnum) {
			case KEERTHI:
			{
				System.out.println("Daughter");
				System.out.println("School: UTD");
				
			}
			break;
			case SANJU:
			{
				System.out.println("Daughter");
				System.out.println("School: LHS");
			}
			break;
			case KISHAN:
			{
				System.out.println("Son");
				System.out.println("School: FMS");
			}
			break;
			case NIRMALA:
			{
				System.out.println("Wife");

			}
			break;
		}
	}
}
