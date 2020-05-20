package com.ds.java;

public class FindMissingNumInArray {

	public static void main(String[] args) {
		int[] arr1={7,5,6,1,4,2};
	  int n=arr1.length+1;
	  int sum=n*(n+1)/2;
	  int restSum=0;
	  for(int i=0;i<arr1.length;i++) {
		  restSum+=arr1[i];
	  }

	  int missNum=sum-restSum;
	  System.out.println(missNum);
	}

}
