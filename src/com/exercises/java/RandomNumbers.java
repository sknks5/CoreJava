package com.exercises.java;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Random;
import java.util.Vector;

public class RandomNumbers {
	
	public static  void main(String[] args){
		Random rand = new Random();
		for (int i=0;i<10;i++){
		  System.out.println(rand.nextInt(6));
	}
		
		Vector rows = new Vector();
		rows.add(2);
		rows.add(1);
		rows.add(271);
		
		Enumeration nbrRtrs  = rows.elements();
		while (nbrRtrs.hasMoreElements())
		{
			Integer nbrRtrId = ((Integer) nbrRtrs.nextElement()).intValue();
			System.out.println(nbrRtrId);
		}
		
		System.out.println("$$$$$$$$$$$$$$$ Now doing it in a loop ");
		for (int i=0;i<rows.size();i++)
		{
			System.out.println(rows.get(i));	
			if ((Integer)rows.get(i) == 1)
			{
				System.out.println("Exiting");
				break;
			}
		}
		
		String[] names = {"kishan", "sanju"};
		System.out.println("Name ==>" + Arrays.toString(names));
		
		
		try{
		String name = null;
		if (name.isEmpty())
		{
			
			System.out.println("Name empty");
		}
		}
		catch (Exception ex)
		{
			StringWriter sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw);
			ex.printStackTrace(pw);
			System.out.println("Exception --> " + sw.toString());
			
			//ex.printStackTrace();
		}
		
 }
}
