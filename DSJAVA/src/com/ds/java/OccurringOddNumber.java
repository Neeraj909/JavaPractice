package com.ds.java;

import java.util.HashMap;
import java.util.Map;

public class OccurringOddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		int oddnum=0;
	int[] arr = { 2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2 };
		for(i=0;i<arr.length;i++) {
			int count=0;
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j]) 
					count++;
				
			}
			if(count%2!=0) {
				oddnum=arr[i];
			}
		}
		
		
		//using map
		Map<Integer,Integer> map=new HashMap();
		for(int k=0;k<arr.length;k++) {
			if(map.containsKey(arr[k])) {
				int val= map.get(arr[k]);
				map.put(arr[k], val+1);
			}
			else {
				map.put(arr[k], 1);
			}
		}
		for(Integer num:map.keySet()) {
			if(map.get(num)%2!=0) 
				oddnum=num;
		
	}
		System.out.println(oddnum);
	}
}
