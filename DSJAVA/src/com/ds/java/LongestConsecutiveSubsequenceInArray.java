package com.ds.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class LongestConsecutiveSubsequenceInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 2, 10, 3, 11, 4, 5, 6, 7, 8, 12 };
		int n = arr.length;

		// System.out.println(array(arr));
		int num = LongIncrConseqSubseq(arr, n);
		System.out.println(num);
		List list = new ArrayList();
		List list1 = new ArrayList();
		int count;
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			temp = arr[i];
			count = 0;
			for (int j = i + 1; j < arr.length; j++) {
				if (Math.abs(temp - arr[j]) == 1) {
					temp = arr[j];
					count++;
					list.add(arr[j]);

				}
			}
			if (list1.size() <= count) {
				list1.addAll(list);
				list1.add(arr[i]);
				list.clear();

			}
		}

	}

	public static int array(int[] array) {
		int count = 0, temp = 1;
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

	static int LongIncrConseqSubseq(int arr[], int n) {

		HashMap<Integer, Integer> map = new HashMap<>();

		map.put(arr[0], 1);
		for (int i = 1; i < n; i++) {

			// check if last consequent of arr[i] exist or not
			if (map.containsKey(arr[i] - 1)) {

				// put the updated consequent number
				// and increment its value(length)
				map.put(arr[i], map.get(arr[i] - 1) + 1);

				// remove the last consequent number
				map.remove(arr[i] - 1);
			}

			// if their is no last consequent of
			// arr[i] then put arr[i]
			else {
				map.put(arr[i], 1);
			}
		}
		return Collections.max(map.values());
	}

}
