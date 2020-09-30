package com.ds.java;

import java.util.Scanner;

public class StringAlternatCharcter {
	 public static void main(String args[] ) throws Exception {

	Scanner scn=new Scanner(System.in);
    String str=scn.nextLine();
    int[] occ = new int[122]; 

  String s = str.toLowerCase();

  for (int i = 0; i < str.length(); i++)  
  { 
        
      char temp = s.charAt(i); 
      occ[temp]++; 

      if (occ[temp]%2 != 0) 
          System.out.print(str.charAt(i)); 
  } 
  System.out.println();
  
}
}
