package com.string;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

public class RegularExpressions {
	public static void main(String[] args) {
//		String s="Java123@#* ;.";
//		String[] split = s.split("\\W");
//		for (String str : split) {
//			System.out.println(str);
//			
//			String[] split2 = str.split("\\d");
//			for (String str2 : split2) {
//				System.out.println(str2);
//			System.out.println(str2);
//		}	
//		}
		
		//my interview quetion
		//input - Ketaki))))m.123.aspiresystems
		//output - Ketaki M 
		
		List<String> l=new ArrayList<>();
		
		
		String s="Ketaki))))#m.123.aspiresystems";
		
		//remove white spaces
		String[] split3 = s.split("\\.");
		for (String string3 : split3) {
		//	System.out.println(string3);
		
		//remove special character
		String[] split1 = string3.split("\\W");
		for (String string1 : split1) {
		//	System.out.println(string1);
			
		//remove white spaces
			String[] split2 = string1.split("\\s");
			for (String string2 : split2) {
			//	System.out.println(string2);
				
				String[] split4 = string1.split("\\d");
				for (String string4 : split4) {
				//	System.out.println(string4);
					
				//	string4.replaceAll("\\s", "");
				
					
					l.add(string4);
					
				}
			}
		}
		}
		
		System.out.println(l);

	}
		

}
