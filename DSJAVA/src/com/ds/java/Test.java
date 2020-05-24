package com.ds.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

public class Test  {
	int a;
	int b;
	public void m1(int a,int b) {
		a=a;
		b=b;
	}

	public static void main(String[] args) {
		
		TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	      map.put(100,"Amit");    
	      map.put(102,"Ravi");    
	      map.put(101,"Vijay");    
	      map.put(103,"Rahul");  
	      map.put(104,"Rahul");    
	      System.out.println(map);
	      //Returns key-value pairs whose keys are less than the specified key.  
	      System.out.println("headMap: "+map.headMap(102));  
	      //Returns key-value pairs whose keys are greater than or equal to the specified key.  
	      System.out.println("tailMap: "+map.tailMap(102));  
	      //Returns key-value pairs exists in between the specified key.  
	      System.out.println("subMap: "+map.subMap(100, 102));   
	      List<String> duplicatList = new ArrayList<String>();
	      duplicatList = Arrays.asList("AA","BB","CC","DD","DD","EE","AA","FF");
	      //above AA and DD are duplicate
	      Set<String> uniqueList = new HashSet<String>(duplicatList);
	      duplicatList = new ArrayList<String>(uniqueList); //let GC will doing free memory
	      System.out.println("Removed Duplicate : "+duplicatList);
	    
	}
	

}
