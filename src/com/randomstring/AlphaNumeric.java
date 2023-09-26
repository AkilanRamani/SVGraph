package com.randomstring;

public class AlphaNumeric {
	
		static String getAlphaNumericString(int n)
		{

		// choose a Character random from this String
		String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
				+ "0123456789"
				+ "abcdefghijklmnopqrstuvxyz";
		
		StringBuilder sb = new StringBuilder(n);

		for (int i = 0; i < n; i++) {
		int index
			= (int)(AlphaNumericString.length()
			* Math.random());

		// add Character one by one in end of sb
		sb.append(AlphaNumericString
			.charAt(index));
		}

		return sb.toString();
		}

		public static void main(String[] args)
		{
			
			int n = 20;
			
			System.out.println(AlphaNumeric.getAlphaNumericString(n));
				      
		}
		
	}


