package com.exercises.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CopyLines {

	public static void main(String[] args) throws IOException{

		BufferedReader lineReader = null;
		PrintWriter lineWriter = null;
		lineReader = new BufferedReader(new FileReader("C:\\ems\\tools\\marsws\\CoreJava\\src\\com\\exercises\\Collection\\FamilyNames.txt"));
		lineWriter = new PrintWriter(new FileWriter("C:\\ems\\tools\\marsws\\CoreJava\\src\\com\\exercises\\Collection\\output.txt"));

		String line;
		int iocount = 0;
		try {
			while ((line = lineReader.readLine()) != null){
				//System.out.println(line);
				lineWriter.println(line);
				iocount++;
			}
			System.out.println("Total io count = " + iocount);
		}
		finally{
			if (lineReader != null)
				lineReader.close();
			if (lineWriter != null)
				lineWriter.close();

		}
	}
}
