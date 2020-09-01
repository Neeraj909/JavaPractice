package com.ds.java;

public class ManpulateTheString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        String s1 = "MY NAME IS NEERAJ";
		        String rev="";
		        char ch[]=s1.toCharArray();
		        int size1=s1.length()-1;
		        int size=0;
		        while(size<ch.length){
		            if(ch[size]==' '){
		                size++;
		                rev=rev+" ";
		            }
		            else{
		                if(s1.charAt(size1)==' '){
		                    size1--;
		                }
		                rev=rev+s1.charAt(size1);
		                size1--;
		                size++;
		            }



		        }
		        System.out.println(s1);
		        System.out.println(rev);

		    }

	}


