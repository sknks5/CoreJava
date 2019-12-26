package Objects;

import java.math.BigInteger;

public class StringNumberCheck {
	
	public static void main(String[] args){
		
	String input = "  5864841689 ";
	BigInteger inputNumber = null;
	BigInteger minValue = new BigInteger("0");
	BigInteger maxValue = new BigInteger("4864841689");
	
	try{
		inputNumber = new BigInteger(input.trim());
		}
	catch(java.lang.NumberFormatException ex)
	{
		System.out.println("Bad Number");	
	}
	
	System.out.println(inputNumber);
	int cmpMin = inputNumber.compareTo(minValue);
	System.out.println(cmpMin);
	int cmpMax = inputNumber.compareTo(maxValue);
	System.out.println(cmpMax);
	

	}
 }

