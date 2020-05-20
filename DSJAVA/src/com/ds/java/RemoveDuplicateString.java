package com.ds.java;

public class RemoveDuplicateString {

	public static void main(String[] args) {
		String s1="neerajanisha";
		
		char[] chars = s1.toCharArray();
		StringBuilder sb = new StringBuilder();
		boolean repeatedChar;
		for (int i = 0; i < chars.length; i++) {
		    repeatedChar = false;
		    for (int j = i + 1; j < chars.length; j++) {
		        if (chars[i] == chars[j]) {
		            repeatedChar = true;
		            break;
		        }
		    }
		    if (!repeatedChar) {
		        sb.append(chars[i]);
		    }
		}
		System.out.println(sb);		

	}

}
