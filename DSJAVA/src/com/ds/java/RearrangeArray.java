package com.ds.java;

public class RearrangeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2, 3, -4, -1, 6, -9}; 
		ArrangeArray(arr);
	}

	public static void ArrangeArray(int arr[]) {
		int n = arr.length;
		int i = -1, j = n;

		while (i < j) {
			while (arr[++i] > 0) {
				System.out.println("d");
			}
				
			while (arr[--j] < 0)
				{
				System.out.println("e");
				}
				
			if (i < j)
				swap(arr, i, j);
		}

		if (i == 0 || i == n)
			return;

		int k = 0;
		while (k < n && i < n) {

			swap(arr, k, i);
			i = i + 1;
			k = k + 2;

		}
		
		    for (int l = 0; l < n; l++)  
		           System.out.print(arr[l] + " ");  
		       System.out.println(""); 
		
	}

	static void swap(int arr[], int index1, int index2) {
		int c = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = c;
	}
}
