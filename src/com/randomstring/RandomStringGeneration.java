package com.randomstring;

import java.util.Scanner;
import java.util.UUID;

public class RandomStringGeneration {

	public static void main(String[] args) {

		    String randomStr = usingRandomUUID();



		    System.out.println("A random string of characters : " + randomStr);

		   

		 }  

		 static String usingRandomUUID() {

		    UUID randomUUID = UUID.randomUUID();

		    return randomUUID.toString().replaceAll("-", "");

		  }

		

	}


