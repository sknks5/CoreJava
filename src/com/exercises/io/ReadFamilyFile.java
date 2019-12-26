package com.exercises.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadFamilyFile {

	public static void main(String[] args) throws IOException{

		FileInputStream in = null;
		FileOutputStream out = null;

		try {
			in = new FileInputStream("C:\\ems\\tools\\marsws\\CoreJava\\src\\com\\exercises\\Collection\\FamilyNames.txt.txt");
			out = new FileOutputStream("C:\\ems\\tools\\marsws\\CoreJava\\src\\com\\exercises\\Collection\\output.txt");
			int c;

			while ((c = in.read()) != -1){
				System.out.println(c);
				out.write(c);				
			}

		}

		finally{
			if (in != null){
				in.close();
			}
			if (out != null){
				out.close();
			}		

		}

	}

}
