package com.ds.java;

public class ClosedToZeroInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1,3,-5,7,8,20,-40,6};
		int pairIndex1=0;
		int pairIndex2=1;
		int minSum=arr[0]+arr[1];
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				int tempSum=arr[i]+arr[j];
				if(Math.abs(tempSum)<Math.abs(minSum)) {
					pairIndex1=i;
					pairIndex2=j;
					minSum=tempSum;
				}
			}
		}
	}

}
