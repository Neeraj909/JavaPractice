package com.ds.java;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortTheArray {
	public static void sortArray(int arr[], int N) {

		// Traverse the array
		for (int i = 0; i < N; ) {

			// If the current element is
			// at correct position
			if (arr[i] == i + 1) {
				i++;
			}

			// Else swap the current element
			// with it's correct position
			else {
				// Swap the value of
				// arr[i] and arr[arr[i]-1]
				int temp1 = arr[i];
				int temp2 = arr[arr[i] - 1];
				arr[i] = temp2;
				arr[temp1 - 1] = temp1;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5, 1, 6, 2, 4, 3};
		int i, j, key;
		for (i = 1; i < arr.length; i++) 
		{
			j = i;
	 		while (j > 0 && arr[j - 1] > arr[j]) 
	 		{
	 			key = arr[j];
	 			arr[j] = arr[j - 1];
	 			arr[j - 1] = key;
	 			j--;
	 		}
		}
		for(int  k=0;k<arr.length;k++) {
			System.out.println(arr[k]);
		}
		Map map =new HashMap();
		map.put("ss","dss");
		map.put(1, 1);
		HashMap map1=new HashMap();
		map1.put(map, "hjjh");
		System.out.println(map1);
		TreeMap t=new TreeMap();
		t.put("1", "2");
		t.put("bb", "value");
		System.out.println(t);
		
		LinkedHashMap l =new LinkedHashMap();
		l.put(2, 9);
		l.put(1, 3);
		l.put(4, 5);
		l.put(3, 6);
		System.out.println(l);
		

	}

}
