package com.ds.java;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Test1 implements Animal,Brid{
	public int x;
	public static void main(String[] args) {
		
		char ch='x';
		
System.out.println((x);
		
		String s = "abab";
		int n = s.length();
		StringBuilder sb = new StringBuilder(s);
		String rvsStr = sb.reverse().toString();
		int counter = 0;
		for (int i = 0; i < n; i++) {
			if (s.charAt(i) != rvsStr.charAt(i)) {
				++counter;
			}
		}
		System.out.println(counter);
		System.out.println(getFromDate());
	
	    String text="abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz";
		System.out.println(maximumOccurringCharacter(text));

	}
	private static String getFromDate(){
        LocalDate localDate = LocalDate.now(ZoneId.of("America/New_York"));
        LocalDate yes = localDate.minusDays(1);
        return yes.toString();
    }
	public static char maximumOccurringCharacter(String text) {
        char ch = 0;
        Map<Character,Integer> map=new TreeMap<Character,Integer>();
     for(int i=0;i<text.length();i++){
        if(map.containsKey(text.charAt(i))){
            map.put(text.charAt(i),map.get(text.charAt(i))+1);
        } 
        else{
             map.put(text.charAt(i),1);
        }
     }
     System.out.println(map);
        int maxValueInMap=(Collections.max(map.values()));  
        
            for (Map.Entry<Character, Integer> entry : map.entrySet()) { 
            	System.out.println(entry.getKey());
                if (entry.getValue()==maxValueInMap) {
                   ch= entry.getKey();
                   break;
                }
            }
            return ch;
    }

}

