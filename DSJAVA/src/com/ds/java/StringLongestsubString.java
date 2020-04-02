package com.ds.java;

import java.util.HashMap;
import java.util.Map;

public class StringLongestsubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "NnerajSharma";
		s1 = s1.toUpperCase();
		StringBuilder sb=new StringBuilder();
		Map<Integer,Character> map=new HashMap<Integer,Character>();
		int count = 0;
		int lengh = 0;
		int k=0;
		while(k<s1.length()) {
			map.put(k, s1.charAt(k));
		for (int i = k+1; i < s1.length(); i++) { 
			if(!map.containsValue(s1.charAt(i-1))) {
				map.put(i, s1.charAt(i-1));
				
			}
			else {
				
			}
		}
		k++;
		}
	}
}
