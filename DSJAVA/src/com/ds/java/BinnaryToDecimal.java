package com.ds.java;

import java.util.Scanner;

public class BinnaryToDecimal {
	public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
         Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        System.out.println(binaryToDecimal(n));
    }
    static int binaryToDecimal(int n) 
    { 
        int num = n; 
        int dec_value = 0; 
        int base = 1; 
        int temp = num; 
        while (temp > 0) { 
            int last_digit = temp % 10; 
            temp = temp / 10; 
            dec_value += last_digit * base; 
            base = base * 2; 
        } 
  
        return dec_value; 
    } 

}
