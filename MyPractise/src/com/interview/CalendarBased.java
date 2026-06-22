package com.interview;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class CalendarBased {
	public static void main(String[] args) throws ParseException {
		//1.  Get Current Date and Time
		Calendar calendar = Calendar.getInstance();
		System.out.println("Current Date and Time: " + calendar.getTime());
		
		//2.Add Days to Current Date
		calendar.add(calendar.DATE, 5);// ADD 5 days
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("Date after 5 days: " + sdf.format(calendar.getTime()));
		
		//3. Find Difference Between Two Dates
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
		Date date1 = sdf2.parse("2025-07-01");
        Date date2 = sdf2.parse("2025-07-18");
        
        long diffInMillis = date2.getTime() - date1.getTime();
        long daysDiff = TimeUnit.MILLISECONDS.toDays(diffInMillis);
        
        System.out.println("Days difference: " + daysDiff);
        
        //4. Check if a Year is a Leap Year
        int year1 = 2024;
        boolean isLeap = new GregorianCalendar().isLeapYear(year1);
        System.out.println(year1 + " is a leap year? " + isLeap);
        
        //5. Print Calendar for a Given Month and Year
        int year = 2025;
        int month = Calendar.JULY; // 0-based (January is 0)
        
        Calendar cal = Calendar.getInstance();
        cal.set(year, month, 1);
        int daysInMonth = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        System.out.println("Calendar for July 2025:");
        for (int i = 1; i <= daysInMonth; i++) {
            cal.set(Calendar.DAY_OF_MONTH, i);
       //     int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
            System.out.println("Day " + i + ": " + cal.getTime().toString());
        }
        
        
        //6. Check if Given Date is Weekend
        String input = "2025-07-20"; // Example date
        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf3.parse(input);

        Calendar cal2 = Calendar.getInstance();
        cal2.setTime(date);

        int dayOfWeek = cal2.get(Calendar.DAY_OF_WEEK);
        boolean isWeekend = (dayOfWeek == Calendar.SATURDAY || dayOfWeek == Calendar.SUNDAY);

        System.out.println(input + " is weekend? " + isWeekend);
        
        
        
        //7. Get Day of the Week for a Given Date
        String dateStr = "2025-07-18";
        SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy-MM-dd");
        Date date3 = sdf4.parse(dateStr);

        Calendar cal4 = Calendar.getInstance();
        cal4.setTime(date3);

        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int day4 = cal4.get(Calendar.DAY_OF_WEEK); // 1=Sunday, 7=Saturday

        System.out.println("Day of the week: " + days[day4 - 1]);
    }
        
		

}
