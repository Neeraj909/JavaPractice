package com.ds.java;

public class SortTheArray {

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

	}

}
