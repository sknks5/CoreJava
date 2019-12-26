package Objects;

public class CurrencyEnumTest {

	private CurrencyEnum allowance;
	
	public static void main(String[] args){
		
		CurrencyEnumTest currency = new CurrencyEnumTest();
		currency.allowance = CurrencyEnum.ONE_DOLLAR;

		switch(currency.allowance){
			case FIVE_DOLLARS:
			   System.out.println("You have got five dollars");
			   break;
			case TEN_DOLLARS:
				   System.out.println("You have got 10 dollars");
				   break;
			case ONE_DOLLAR:
				   System.out.println("You have got 1 dollars");
				   break;
				   
			case TWENTY_DOLLARS:
				   System.out.println("You have got 20 dollars");
				   break;

		}
		
		for (CurrencyEnum currEnum : CurrencyEnum.values()){
			System.out.println(currEnum + " " + currEnum.ordinal());
			
		}
	}


}
