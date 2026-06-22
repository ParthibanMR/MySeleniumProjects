package com.interview;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarPractise {
	public static void main(String[] args) {

	Calendar calendar = Calendar.getInstance();
//	System.out.println(calendar.getTime());
//	
//	SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd");
//	System.out.println(sdf.format(calendar.getTime()));
		
		 int year = 2025;
	        int month = 6;
	        
	        calendar.set(year, month, 1);
	        
	        int maximumDaysInMonth = calendar.getActualMaximum(calendar.DAY_OF_MONTH);
	        
	        for (int i = 1; i <= maximumDaysInMonth; i++) {
				calendar.set(calendar.DAY_OF_MONTH, i);
				System.out.println("Day: "+i+" "+calendar.getTime());
			}
	
	
	

	
	}
}
