package com.ds.java;

import java.util.Arrays;

public class RemoveDuplicateFromArray {


	public static void remove(int arr[]) {
		int no_unique_elements =arr.length;
		for (int i = 0; i < no_unique_elements; i++) 
        {
            for (int j = i+1; j < no_unique_elements; j++)
            {
                //If any two elements are found equal
                 
                if(arr[i] == arr[j])
                {
                    //Replace duplicate element with last unique element
                     
                	arr[j] = arr[no_unique_elements-1];
                     
                    no_unique_elements--;
                     
                    j--;
                }
            }
        }
		int[] array1 = Arrays.copyOf(arr, no_unique_elements);
		for(int i=0;i<no_unique_elements;i++)
		System.out.println(arr[i]);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 2, 1, 2, 4, 6, 7 };
		remove(intArray);
		

	}

}
