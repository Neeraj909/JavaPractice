package com.ds.java;

public class segrateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0 };
		int n = 0;
		int k = arr.length - 1;
		while (n <= k) {
			if (arr[n] == 1) {
				if (arr[k] == 0) {
					arr[n] = 0;
					arr[k] = 1;
				} else {
					k--;
				}
			} else {

				n++;
			}

		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}

	}
}
