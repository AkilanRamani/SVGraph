package com.randomstring;

import java.util.UUID;

public class RandomString {

  public static void main(String[] args) {

    String randomStr = usingRandomUUID();

    System.out.println("A random string of 32 characters: " + randomStr);

    

  }

  static String usingRandomUUID() {

    UUID randomUUID = UUID.randomUUID();

    return randomUUID.toString().replaceAll("_", "");

  }


}
