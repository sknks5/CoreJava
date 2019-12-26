package com.ems.verify;

public class IPAddressUtilTester {
	
	public static void main(String[] args){
		IPAddressUtil ipAddressUtil = new IPAddressUtil();
		byte[] byteOrder = new byte[50];
		byteOrder = ipAddressUtil.textToNumericFormatV6("fd2c:4708:5563:2060:f816:3eff:feeb:6d7b");
		
		if (byteOrder != null)
			//test
			System.out.println("Conversion successful");
		else
			//test
			System.out.println("Conversion failed");
		
		String remoteIp = "1.2.3.4";
		String localIp = "1.2.3.4";
		
		if (remoteIp.equals(localIp))
			//remote and local ip are the same
			System.out.println("Remote IP and Local IP are equal");
		else
			//remote and local ip are NOT the same			
			System.out.println("Remote IP and Local IP are NOT equal");		    
	}

}
