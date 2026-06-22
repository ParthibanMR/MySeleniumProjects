package com.interview;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Occurance {
	public static void main(String[] args) {
		String arr[]= {"12","a", "java", "12/12/2021"};
		
		for (int i = 0; i < arr.length; i++) {
			String n=arr[i];
			System.out.println(n);
		}
		String num=arr[0];
	     System.out.println(num);
	     int parseInt = Integer.parseInt(num);
	     System.out.println("Integer: "+parseInt);
	     
		String ch=arr[1];
		System.out.println(String.valueOf(ch));	
		
		String date=arr[3];
		SimpleDateFormat s=new SimpleDateFormat();
		s.format("dd/mm/yyyy");
		System.out.println(s);
	}
	

}
