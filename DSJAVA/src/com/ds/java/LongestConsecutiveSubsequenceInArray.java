package com.ds.java;

public class LongestConsecutiveSubsequenceInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp=1;
		int arr[]= {1, 9, 3, 10, 4, 20, 2};
		
		System.out.println(array(arr));

	}

	public static int array(int[] array) {
        int count = 0, temp = 0;
        for (int i = 0; i < array.length; i++) {
            count = 0;
            for (int j = i, k = i + 1; j < array.length - 1; j++, k++) {
                if (Math.abs(array[j] - array[k]) == 1) {
                    count++;
                } else {
                    if (temp <= count) {
                        temp = count;
                    }
                    break;
                }
            }
        }
        return temp + 1;
    }
}
