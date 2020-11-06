package com.ds.java;

import java.util.Arrays;
import java.util.List;

public class MergeTwoArrays {
	private static int[] mergeArray(int[] arrayA, int[] arrayB)
    {
        int[] mergedArray = new int[arrayA.length + arrayB.length];
         
        int i=0, j=0, k=0;
         
        while (i < arrayA.length &&j < arrayB.length)
        {
            if (arrayA[i] < arrayB[j]) 
            {
                mergedArray[k] = arrayA[i];
                i++;
                k++;
            } 
            else
            {
                mergedArray[k] = arrayB[j];
                j++;
                k++;
            }
        } 
                 
        while (i < arrayA.length) 
        {
            mergedArray[k] = arrayA[i];
            i++;
            k++;
        } 
                 
        while (j < arrayB.length) 
        {
            mergedArray[k] = arrayB[j];
            j++;
            k++;
        } 
             
        return mergedArray;
    }
	public static List<Integer> mergeArrays(List<Integer> a, List<Integer> b) {
        Integer[] arrayA = new Integer[a.size()];
        arrayA = a.toArray(arrayA);
        Integer[] arrayB = new Integer[b.size()];
        arrayB = b.toArray(arrayB);
        Integer[] mergedArray = new Integer[arrayA.length + arrayB.length];
         int i=0, j=0, k=0;
        while (i < arrayA.length &&j < arrayB.length)
        {
            if (arrayA[i] < arrayB[j]) 
            {
                mergedArray[k] = arrayA[i];
                i++;
                k++;
            } 
            else
            {
                mergedArray[k] = arrayB[j];
                j++;
                k++;
            }
        } 
                 
        while (i < arrayA.length) 
        {
            mergedArray[k] = arrayA[i];
            i++;
            k++;
        } 
                 
        while (j < arrayB.length) 
        {
            mergedArray[k] = arrayB[j];
            j++;
            k++;
        } 
        return Arrays.asList(mergedArray);

    }


     
    public static void main(String[] args) 
    {
    	Integer[] arrayA = new Integer[] {-7, 12, 17, 29, 41, 56, 79};
         
    	Integer[] arrayB = new Integer[] {-9, -3, 0, 5, 19,12};
         
        List<Integer> list=mergeArrays(Arrays.asList(arrayA), Arrays.asList(arrayB));
         
        System.out.println("Array A : "+Arrays.toString(arrayA));
         
        System.out.println("Array B : "+list);
         
        //System.out.println("Merged Array : "+Arrays.toString(mergedArray));
        
    }

}
