package com.ds.java;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "a23b3c1n3";
		String regex = "((?<=[a-zA-Z])(?=[0-9]))|((?<=[0-9])(?=[a-zA-Z]))";
		StringBuilder bulide = new StringBuilder();
		int count;
		
		String[] chararra = s1.split(regex);
		
		for (int i = 0; i < chararra.length; i++) {
			String value = chararra[i];
			count=0;
			int num = Integer.parseInt(chararra[++i]);
			while (count < num) {
				bulide.append(value);
				count++;
			}

		}
		System.out.println(bulide);
	}

}