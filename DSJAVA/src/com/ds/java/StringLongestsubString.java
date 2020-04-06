package com.ds.java;

import java.util.HashMap;
import java.util.Map;

public class StringLongestsubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "NnerajSharma";
		s1 = s1.toUpperCase();
		Map<Integer,Character> map=new HashMap<Integer,Character>();
		Map<Integer,Character> newMap=new HashMap<Integer,Character>();
		int count = 1;
		int lengh = 0;
		int k=0;
		while(k<s1.length()) {
			map.put(k, s1.charAt(k));
			count = 1;
		for (int i = k+1; i < s1.length(); i++) { 
			if(!map.containsValue(s1.charAt(i))) {
				map.put(i, s1.charAt(i));
				count++;
			}
			else {
				
				if(newMap.size()<=count) {
					newMap.clear();
					newMap.putAll(map);
				    
				}
				map.clear();
				break;
			}
		}
		k++;
		
		}
		
	}
}
