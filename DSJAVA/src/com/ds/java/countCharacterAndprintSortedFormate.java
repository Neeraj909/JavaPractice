package com.company;

import java.util.*;

public class Java {
    public static void main(String[] args) {
        String input="annbbbbjiklpp";
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<input.length();i++){
            if(map.containsKey(input.charAt(i))){
                map.put(input.charAt(i),map.get(input.charAt(i))+1);
            }
            else{
                map.put(input.charAt(i),1);
            }
        }
        System.out.println(map);
        List<Map.Entry<Character,Integer>> list=new LinkedList<Map.Entry<Character,Integer>>(map.entrySet());
        Collections.sort(list,new Comparator<Map.Entry<Character,Integer>>(){
                    public int compare(Map.Entry<Character,Integer> l1,Map.Entry<Character,Integer> l2){
                        return (l2.getValue().compareTo(l1.getValue()));
                    }
                }
        );
        Map<Character,Integer> map1=new LinkedHashMap<>();
        for(Map.Entry<Character,Integer> entry:list){
            map1.put(entry.getKey(),entry.getValue());
        }
        System.out.println(map1);

    }
}
