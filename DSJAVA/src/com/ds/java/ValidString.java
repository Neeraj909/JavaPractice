package com.ds.java;

import java.util.Stack;

public class ValidString {

	public static void main(String[] args) {
		 
         String str = "(){}[]";
 
         //Declare a stack
         Stack<Character> st = new Stack<Character>();
 
         //Traverse a string
         for(int i = 0; i < str.length(); i++) {
 
            if(str.charAt(i) == '{' || str.charAt(i) == '[' || str.charAt(i) == '(') {
                   st.push(str.charAt(i));
 
            } else if ( !st.empty() && ((str.charAt(i) == ']' && st.peek() == '[') || (str.charAt(i) == '}' && st.peek() == '{') ||(str.charAt(i) == ')' && st.peek() == '('))) {
 
                   st.pop();
 
             } else {
                  st.push(str.charAt(i));
             }
         }
 
         if(st.empty()) {
              System.out.println("Balanced");
         } else {
              System.out.println("Not balanced");
         }
   }

}
