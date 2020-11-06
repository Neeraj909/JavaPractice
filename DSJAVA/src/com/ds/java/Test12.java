package com.ds.java;


import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

public class Test12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		map.put(1,2);
		System.out.println(getFromDate());
	
		       
	}
	
	
	 private static String getFromDate() {
		 LocalDate localDate = LocalDate.now(ZoneId.of("America/New_York"));
         String date= localDate.toString();
         System.out.println(date);
    	 String month=getMonthName(Integer.parseInt(localDate.toString().substring(5,localDate.toString().length()-3)));
    	  date = date.substring(0,5)+month+"-"+date.substring(date.length()-1);
    	 

       return date;
	    }
	    public static String getMonthName(int monthNumber) {
	        String[] months = new DateFormatSymbols().getMonths();
	        int n = monthNumber-1;
	        return (n >= 0 && n <= 11) ? months[n] : "wrong number";
	    }

}
