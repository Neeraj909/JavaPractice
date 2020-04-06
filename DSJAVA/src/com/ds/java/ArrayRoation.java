package com.ds.java;

import java.util.Arrays;


public class ArrayRoation {
	  public static void rotate(int[] unOrderedArr, int k) {
	        for(int i = 0; i<k; i++){

	            for(int j = unOrderedArr.length-1; j>0; j--){
	                int temp = unOrderedArr[j];
	                unOrderedArr[j] = unOrderedArr[j-1];
	                unOrderedArr[j-1] = temp;
	            }
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
	    
	
}
