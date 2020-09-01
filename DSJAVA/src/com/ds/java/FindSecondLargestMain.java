package com.ds.java;

public class FindSecondLargestMain {

	public static void main(String[] args) {
	
		
		int[] arr1={7,5,6,1,4,2,9};
		int max=Integer.MIN_VALUE;
		int secMax=Integer.MIN_VALUE;
		for(int i=0;i<arr1.length;i++) {
			if(max<arr1[i]) {
				secMax=max;
				max=arr1[i];	
			}
			if(secMax<arr1[i] && arr1[i]!=max) {
				secMax=arr1[i];
				
			}
			
			
		}
		System.out.println(secMax);

	}

}
