package com.string;

import java.util.ArrayList;
import java.util.List;

public class HowToSplitStringToChar {
	public static void main(String[] args) {
		List<Character> l=new ArrayList();;
		String s="java";
		char[] charArray = s.toCharArray();
	
//		for (int i = 0; i < s.length(); i++) {
//			char charAt = s.charAt(i);
//			System.out.println(charAt);
//		
//		}
		for (Character ch : s.toCharArray()) {
		//	System.out.println(ch);
			if (ch.equals('a')) {
				l.add(ch);
				
			}
			}
		System.out.println(l);
	}}	

