package com.ds.java;

import java.util.HashMap;
import java.util.Map;

public class StringLongestsubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "NnverajShafdfedeerergrbbnyjyhcscrma".toLowerCase();
		StringBuffer sb=new StringBuffer();
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		HashMap<Character,Integer> mapCopy=new HashMap<Character,Integer>();
		int count=0;
		for(int i=0;i<s1.length();i++) {
			for(int j=i+1;j<s1.length();j++) {
				if(s1.charAt(i)==s1.charAt(j)|| map.containsKey(s1.charAt(j-1))) {
					count =map.size();
					break;
					
				}
				else {
					map.put(s1.charAt(j-1), i);
				
				}
				
			}
			if(count>mapCopy.size()) {
				mapCopy=(HashMap<Character, Integer>) map.clone();
				map.clear();
			}
			else {
				map.clear();
			}
			
			
		}
		System.out.println(mapCopy);

	}
		
}
