package com.ds.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GetLongestSubString {
	public static void getLongestString(String characters, String[] strings) {
        char ch[] = characters.toCharArray();
        int count = 0;
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < strings.length; i++) {
            char ch1[] = strings[i].toCharArray();
              for (int j = 0; j < ch1.length; j++) {
                if (ch[count] == ch1[j]) {
                    count++;
                } else {
                    count = 0;
                    break;
                }
                if (count == ch.length) {
                    list.add(strings[i]);
                    count=0;
                    break;

                }
            }
        }
        int size=0;
        String rev="";
        for(String s1:list){
            String s2 = Arrays.asList(s1.split(""))
                    .stream()
                    .distinct()
                    .collect(Collectors.joining());
            if(s2.length()==ch.length){
                if(size<s1.length()){
                    size=s1.length();
                    rev=s1;
                }

            }
        }
    }
}
