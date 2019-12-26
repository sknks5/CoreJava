package InnerClasses;

interface RegistrationCard{
	
	ProofOfResidence provideProofOfResidence();
	ParentInformation enterParentInformation();
}

class Parent{
	private String name;
	private String phoneNumber;
	
	public Parent(String name, String PhoneNumber){
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}	
}

class ParentInformation {
	private Parent parent1;
	private Parent parent2;
	
	public Parent getParent1() {
		return parent1;
	}
	public void setParent1(Parent parent1) {
		this.parent1 = parent1;
	}
	public Parent getParent2() {
		return parent2;
	}
	public void setParent2(Parent parent2) {
		this.parent2 = parent2;
	}
	
}
class ProofOfResidence{
	
	private String StreetAddress;
	private String proofOfIdentity;
	public String getStreetAddress() {
		return StreetAddress;
	}
	public void setStreetAddress(String streetAddress) {
		StreetAddress = streetAddress;
	}
	public String getProofOfIdentity() {
		return proofOfIdentity;
	}
	public void setProofOfIdentity(String proofOfIdentity) {
		this.proofOfIdentity = proofOfIdentity;
	}
	
	
}

public class StudentLocalInner {
	
	private String name;
	private String StreetAddress;
	
	public StudentLocalInner(String name){
		this.name = name;
	}
	
	public RegistrationCard getRegistrationCard(){
		class StudentRegistrationCard implements RegistrationCard{
			private ProofOfResidence proof;
			private ParentInformation parentInfo;
			
			@Override
			public ProofOfResidence provideProofOfResidence() {
				proof = new ProofOfResidence();
				proof.setProofOfIdentity("Drivers License");
				proof.setStreetAddress("4433 Waskom Drive");	
				return proof;
			}

			@Override
			public ParentInformation enterParentInformation() {
				parentInfo = new ParentInformation();
				parentInfo.setParent1(new Parent("Nirmala", "123-456-7890"));
				parentInfo.setParent2(new Parent("Sivakumar", "234-567-8901"));
				return parentInfo;
			}			
		}		
		return new StudentRegistrationCard();
	}
	
	public static void main(String[] args){
		StudentLocalInner kishan = new StudentLocalInner("Kishan");
		kishan.StreetAddress = "4433 Waskom Drive";
		RegistrationCard kishansRegCard = kishan.getRegistrationCard();
		System.out.println("Street address on Registration Card = " + kishansRegCard.provideProofOfResidence().getStreetAddress());
		System.out.println("Name of Parent1 = " + kishansRegCard.enterParentInformation().getParent1().getName());
		System.out.println("Name of Parent2 = " + kishansRegCard.enterParentInformation().getParent2().getName());
		System.out.println("Phone of Parent1  = " + kishansRegCard.enterParentInformation().getParent1().getPhoneNumber());
		
		//Change Phone Number for mom
		kishansRegCard.enterParentInformation().getParent1().setPhoneNumber("214-469-4524");
		System.out.println("New Phone of Parent1  = " + kishansRegCard.enterParentInformation().getParent1().getPhoneNumber());
	}

}
