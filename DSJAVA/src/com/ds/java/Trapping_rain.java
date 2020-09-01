package com.ds.java;

public class Trapping_rain {
	    public int trap(int[] arr) {
	        int len = arr.length;
	        if(len==0){
	            return 0;
	        }
	        int[] temp = new int[len];
	        int start = 0, startIndex = 0;
	        
	        // Deciding the starting index
	        for(int i=0;i<len-1;i++){
	            if(arr[i]>arr[i+1]){
	                startIndex = i+1;
	                start = i;
	                break;
	            }
	        }
	        
	        // Starting from 0, Filling water till the maximum element in the array (where possible)
	        for(int i=startIndex;i<len;i++){
	            if(arr[start]<=arr[i]){
	                for(int j=start+1;j<i;j++){
	                    temp[j] = arr[start];
	                }
	                start = i;
	            }            
	        }
	        // Repeating the same process from the back. To cover the element after the max element
	        for(int i=len-1;i>0;i--){
	            if(arr[i]>arr[i-1]){
	                startIndex = i-1;
	                start = i;
	                break;
	            }
	        }
	        for(int i=startIndex;i>=0;i--){
	            if(arr[start]<=arr[i]){
	                for(int j=start-1;j>i;j--){
	                    temp[j] = arr[start];
	                }
	                start = i;
	            }            
	        }
	        int ans = 0;
	        for(int i=0;i<len;i++){
	            ans += Math.max(0, temp[i]-arr[i]); 
	        }
	        return ans;
	    }
	}


