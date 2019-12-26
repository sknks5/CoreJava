package com.exercises.io;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;

public class CopyCharStream {
	

	public static void main(String[] args) throws IOException{

		BufferedReader reader = null;
		
		
		try {
			reader = new BufferedReader(new FileReader("C:\\siva\\aws\\DynamoDB\\ProductCatalog.json"));
			//writer = new FileWriter("C:\\ems\\tools\\marsws\\CoreJava\\src\\com\\exercises\\Collection\\output.txt");
			
			String line;
			while ((line = reader.readLine()) != null){
				System.out.println(line);
			}
		} 
		finally{
			if (reader != null)
			{
				reader.close();
			} 
		}
		
		
	}

}
