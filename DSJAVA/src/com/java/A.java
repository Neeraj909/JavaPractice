package com.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class  A extends B{
	

	public static void main(String[] args) {
		B b=new B();
		System.out.println(b.a);
	Map<String,String> map =new HashMap<>();
	map.put("n", "w");
	System.out.println(map.get("n"));
	System.out.println(map.get("w"));
	System.out.println(map.get("r"));
	System.out.println(map.containsKey("n"));
	System.out.println(map.containsKey("w"));
	System.out.println(map.containsValue("n"));
	System.out.println(map.containsValue("w"));
	for(Entry<String,String > m:map.entrySet()) {
		System.out.println(m.getKey());
		System.out.println(m.getValue());
		System.out.println(map.getClass());
	}
	
		
	}

}
