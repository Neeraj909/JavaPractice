package com.ds.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringAnangram {
	 public static List<Integer> stringAnagram(List<String> dictionary, List<String> query) {
	        List<Integer> list=new ArrayList<>();
	        for(int i=0;i<query.size();i++){
	            int count =0;
	            char queryArr[]=query.get(i).toCharArray();
	            Arrays.sort(queryArr);
	            String queryString=new String(queryArr);
	            for(int j=0;j<dictionary.size();j++){
	                char dictionaryArr[]=dictionary.get(j).toCharArray();
	                Arrays.sort(dictionaryArr);
	                String dictionaryString=new String(dictionaryArr);
	                if(queryString.equals(dictionaryString)){
	                    count++;
	                }
	            }
	            list.add(count);
	        }
	        return list;
	    }

	    public static void main(String[] args) {
	        List<String> dic=new ArrayList<>();
	        dic.add("heater");
	        dic.add("cold");
	        dic.add("clod");
	        dic.add("reheat");
	        dic.add("docl");
	        List<String> query=new ArrayList<>();
	        query.add("heater");
	        query.add("cold");
	        query.add("abcd");
	        List l=stringAnagram(dic,query);

	    }

}
