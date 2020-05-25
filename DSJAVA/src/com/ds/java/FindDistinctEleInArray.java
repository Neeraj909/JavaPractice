package com.ds.java;

public class FindDistinctEleInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 12, 10, 9, 45, 2, 10, 10, 45,12,13,13,14,14,15,15,1,1,2,3}; 
	    int n = arr.length; 
	   
	    for(int i=0;i<n;i++) {
	    	for(int j=i+1;j<n;j++) {
	    		if(arr[i]==arr[j]) {
	    			arr[j]=arr[n-1];
	    			n--;
	    			j--;
	    			
	    		}
	    	}
	    	
	    }
	    for(int i=0;i<n;i++) {
	    	System.out.println(arr[i]);
	    }
	    

	}

}
