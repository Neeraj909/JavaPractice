package com.ds.java;



public class RemoveDuplicateFromArray {

	public static int[] removeDuplicate(int arr[]) {
		  int end = arr.length;

		    for (int i = 0; i < end; i++) {
		        for (int j = i + 1; j < end; j++) {
		            if (arr[i] == arr[j]) {                  
		                int shiftLeft = j;
		                for (int k = j+1; k < end; k++, shiftLeft++) {
		                    arr[shiftLeft] = arr[k];
		                }
		                end--;
		                j--;
		            }
		        }
		    }

		    int[] whitelist = new int[end];
		    for(int i = 0; i < end; i++){
		        whitelist[i] = arr[i];
		    }
		    return whitelist;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10,2,1,2,4,6,7};
		int a[]=removeDuplicate(intArray);
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
			
		}
		
	}

}
