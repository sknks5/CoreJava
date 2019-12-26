package Objects;

public class FinalizeTest {
	
	
	public FinalizeTest(){
		System.out.println("Object initialized");
	}
	
	public static void main(String[] args) throws Throwable{
		FinalizeTest ft = new FinalizeTest();
		ft.finalize();
		System.gc(); //Call Garbage collector

	}

}
