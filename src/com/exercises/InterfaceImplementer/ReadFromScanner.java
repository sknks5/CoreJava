package com.exercises.InterfaceImplementer;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Scanner;

public class ReadFromScanner implements Readable{
	
	private static String keerthi = "Keerthana";
	private static String sanju = "Sanjana";
	private static String kishan = "Kishan";
	private static String vowels = "aeiouAEIOU";

	@Override
	public int read(CharBuffer cb) throws IOException {
		// TODO Auto-generated method stub
		char[] temp = keerthi.toCharArray();
		char[] outputStr = null;
		int j =0;
		for (int i=0;i<keerthi.length();i++){
			cb.append(temp[i]);
			/*
			if (vowels.indexOf(temp[i]) > 0){
				cb.append(temp[i]);
				cb.append('p');
			}
			else
				cb.append(temp[i]);
				*/
		}
		return cb.length();
	}
	
	public static void main (String[] args){
		Scanner sc = new Scanner (new ReadFromScanner() );
		System.out.println(sc.next());
	}

}
