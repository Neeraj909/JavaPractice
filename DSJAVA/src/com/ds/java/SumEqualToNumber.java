package com.ds.java;

public class SumEqualToNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]={ -40, -5, 1, 3, 6, 7, 8, 20 };
		int givenNum=15;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(givenNum==arr[i]+arr[j]) {
					System.out.println(arr[i]+"   "+arr[j]);
				}
			}
		}
		
	}

}
