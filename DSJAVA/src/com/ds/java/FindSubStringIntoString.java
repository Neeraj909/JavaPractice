package com.ds.java;

public class FindSubStringIntoString {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "NeerajSharmaRam";
	    String sub = "Ram";
	    int count = 0;
	    for (int i = 0; i < s.length(); i++) {
	        if (s.charAt(i) == sub.charAt(count)) {
	            count++;
	        } else {
	            count = 0;
	        }
	        if (count == sub.length()) {
	            System.out.println("Sub String");
	            return;
	        }

	    }

	}
}
