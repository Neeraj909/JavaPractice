package com.company;


public class StoreMaximumOfWiater {
    public static void main(String[] args) {
        int  arr[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        //to store maximum water
        int unit=0;
        int n=arr.length;
        for(int i=1;i<n-1;i++){
            int leftValue=arr[i];//1
            for(int j=0;j<i;j++){
                leftValue=Math.max(leftValue,arr[j]);
            }
            int rightValue=arr[i];//3
            for(int j=i+1;j<n;j++){
                rightValue=Math.max(rightValue,arr[j]);
            }
            unit+=Math.min(leftValue,rightValue)-arr[i];
        }
        System.out.println(unit);

    }

}

