package com.interview;

import java.util.Iterator;

public class Sample {
	public static void main(String[] args) {
		String input="ketki^&-#$a).xyzabc@capgemini.com";
		String letter = null;
		String Alphabetic = null;
		
	//	String[] sp=input.split(".");
		
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			System.out.println(ch);
			
			if(Character.isLetter(ch)) {
				letter=letter+ch;
			}else if(Character.isAlphabetic(ch)) {
				Alphabetic=Alphabetic+ch;
				System.out.println(Alphabetic);
			}
		}
		
		
		
		
	}
	
	


}
