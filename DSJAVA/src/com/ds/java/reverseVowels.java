package com.ds.java;

public class reverseVowels {
	 public String reverseVowels(String s) {
	       
	        String vowel="";
	        int j=0;
	        char ch[]=s.toCharArray();
	        for(int i=0;i<ch.length;i++){
	            if(isVowel(ch[i])){
	                j++;
	                vowel+=ch[i];
	            }
	        }
	        for(int i=0;i<ch.length;i++){
	            if(isVowel(ch[i])){
	                ch[i]=vowel.charAt(--j);
	            }
	        }
	          return String.valueOf(ch);
	        
	    }
	       static boolean isVowel(char c) { 
	        return (c == 'a' || c == 'A' || c == 'e'
	                || c == 'E' || c == 'i' || c == 'I'
	                || c == 'o' || c == 'O' || c == 'u'
	                || c == 'U'); 
	    
	}

}
