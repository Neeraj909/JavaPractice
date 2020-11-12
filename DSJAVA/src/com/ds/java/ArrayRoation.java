package com.ds.java;

import java.util.Arrays;


public class ArrayRoation {
	  public static void rotate(int[] unOrderedArr, int k) {
	     int  i=0; 
		  while(i<k){

	            for(int j = unOrderedArr.length-1; j>0; j--){
	                int temp = unOrderedArr[j];
	                unOrderedArr[j] = unOrderedArr[j-1];
	                unOrderedArr[j-1] = temp;
	            }
	            i++;
	        }
	       for(int l=0;l<unOrderedArr.length;l++) {
	    	   System.out.print(unOrderedArr[l]);
	       }
	    }
	    public static void main(String[] args) {
	        int [] unOrderedArr = {1,2,3,4,5,6,7,8};
	        int k=3;
	        rotate(unOrderedArr,k);
	        

	    }
	    int arr[]={1,2,0,0,1,2,3};
     int count=0;
              for(int i=0;i<arr.length;i++){
                  if(arr[i]==0){
                      for(int j=i;j>0;j--){
                          int num=arr[j];
                          arr[j]=arr[j-1];
                          arr[j-1]=num;
                      }
                  }
              }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
	    
	
}
