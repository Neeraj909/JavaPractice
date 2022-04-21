package com.ds.java;

public class GenearetGivenNumString {
    // you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

    class Solution {
        public String solution(int N) {
            // write your code in Java SE 8
            String generateString="";
            if(N%2 !=0){
                for(int i=0;i<Math.min(N,24);i++){
                    generateString+=(char)('b' +i);
                }
                if(N>24){
                    for(int i=0;i<(N-24);i++){
                        generateString+='a';
                    }
                }
            }
            else{
                for(int i=0;i<Math.min(N,25);i++){
                    generateString+=(char)('b' +i);
                }
                if(N>25){
                    for(int i=0;i<(N-25);i++)
                        generateString+='a';
                }
            }
            return generateString;
        }
    }


}
