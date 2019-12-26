package com.exercises.network;

import java.io.IOException;
import java.net.*;
import java.util.Date;

class BadArgumentException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BadArgumentException(String message){
		super(message);
	}


}

public class UrlInfo {


	public static void main(String[] args) throws IOException, BadArgumentException{

		if (args.length != 1 )
			throw new BadArgumentException("Bad Arguments provided");
		else{
			
			try {
				URL url = new URL(args[0]);
				URLConnection urlConnection = url.openConnection();
				System.out.println(urlConnection.getContentType());
				System.out.println(new Date(urlConnection.getDate()));
				System.out.println(new Date(urlConnection.getLastModified()));
			} 
			catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

}
